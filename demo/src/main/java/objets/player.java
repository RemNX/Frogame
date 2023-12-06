package objets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import autre.fct;
import interface_graphique.tirage;

public class player {

    /* #region //?-----Attributs----- */
    private String name;
    private int level;
    private int experience;
    private int money;
    private ArrayList<card> cards;
    private int id;
    /* #endregion */

    /* #region //?-----Constructeurs----- */
    public player(String name, int level, int experience, int money, int id) {
        this.setname(name);
        this.setlevel(level);
        this.setexp(experience);
        this.setmoney(money);
        this.cards = new ArrayList<card>();
        this.setid(id);
    }
    /* #endregion */

    /* #region //?-----Accesseurs------ */
    public String getname() {
        return this.name;
    }

    public int getlevel() {
        return this.level;
    }

    public int getxp() {
        return this.experience;
    }

    public int getmoney() {
        return this.money;
    }

    public ArrayList<card> getcards() {
        return this.cards;
    }

    public int getid(){
        return this.id;
    }
    /* #endregion */

    /* #region //?-----Modificateurs----*/
    public void setname(String name){
        this.name=name;
    }

    public void setlevel(int level){
        this.level=level;
    }

    public void setexp(int xp){
        this.experience=xp;
    };

    public void setmoney(int money){
        this.money=money;
    }

    public void setcards(ArrayList<card> cards) {
        this.cards = cards;
    }

    public void setid(int id){
        this.id=id;
    }
    /* #endregion */

    /* #region //?-------Méthodes------ */
    public String toString() {
        return this.name;
    }

    // ,afficher le noms et le nombre de cartes possédés
    public void toutescartes() {
        System.out.println("-------------");
        for (int i = 0; i < this.getcards().size(); i++) {
            System.out.println(this.getname() + " : " + this.getcards().get(i).gettype() + " " + this.getcards().get(i).getnombre()+" "+this.getcards().get(i).getniveau());
        }
        System.out.println("-------------");
    }

    public void ajoute(type_card type_card, int howmany) {
        card card=new card(type_card,howmany);
        boolean ind = true;
        for (card i : this.getcards()) {
            if (i.gettype().getname() == card.gettype().getname()) {
                i.setnombre(i.getnombre() + howmany);
                ind = false;
                break;
            }
        }
        if (ind) {
            this.getcards().add(card);
        }
    }

    public void enleve(type_card type_card, int howmany) {
        card card=new card(type_card,howmany);
        for (int i = 0; i < this.getcards().size(); i++) {
            if ((this.getcards().get(i).gettype().getname() == card.gettype().getname())
                    && (this.getcards().get(i).getnombre() > howmany)) {
                this.getcards().get(i).setnombre(this.getcards().get(i).getnombre() - howmany);
            } else if ((this.getcards().get(i).gettype() == card.gettype())
                    && (this.getcards().get(i).getnombre() == howmany)) {
                this.getcards().remove(this.getcards().get(i));
            }
        }
    }

    public void echange(player guy2, type_card ech1, type_card ech2) {
        player guy1 = this;
        guy1.ajoute(ech2,1);
        guy2.ajoute(ech1,1);
        guy1.enleve(ech1,1);
        guy2.enleve(ech2,1);
    }

    public void openbooster(int idBooster) {
        int nbcartes=5;
        Random random = new Random();
        String txt = "";
        for (int i=0;i<nbcartes;i++){
            int drop_rarity=fct.randrop(stocklists.listbooster[idBooster].getdrop());
            int drop_card=random.nextInt(stocklists.listtype[drop_rarity].length);
            type_card thecard=stocklists.listtype[drop_rarity][drop_card];
            this.ajoute(thecard,1);
            ajoutecard(thecard.getid(),1,this.getid());
            txt+=(thecard.getname()+" \n");
            tirage.affichage.setText(txt);
        }
    }




    private Connection connect() {
        Connection conn = null;
        try{Class.forName("org.sqlite.JDBC");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void ajoutecard(int  idc, int nombre, int idp){
        String sqlaj =
        "insert into cards select "+idc+",0,0,0,"+idp+" where not exists (select * from cards where idc="+idc+" and idp="+idp+");";
        String sqlup=
        "update cards set nombre=(select nombre from cards where idc="+idc+" and idp="+idp+")+"+nombre+" where idc="+idc+" and idp="+idp+";";
        try(Connection conn =this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlaj); PreparedStatement pstmt2 = conn.prepareStatement(sqlup)){
            pstmt.executeUpdate();
            pstmt2.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public void enlevecard(int  idc, int nombre, int idp){
        String sqlup=
        "update cards set nombre=(select nombre from cards where idc="+idc+" and idp="+idp+")-"+nombre+" where idc="+idc+" and idp="+idp+";";
        try(Connection conn =this.connect(); PreparedStatement pstmt2 = conn.prepareStatement(sqlup)){
            pstmt2.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    /* #endregion */
}

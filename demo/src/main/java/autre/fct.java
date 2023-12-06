package autre;
import java.util.Random;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class fct {
    public static int randrop(double[] listdrop){
        Boolean retour=false;
        int res=0;
        double sum = 0;
        for (int i=0 ; i<listdrop.length;i++){
            sum += listdrop[i];
        }

        Random random = new Random();
        double rel = random.nextDouble()*sum;

        for (int i =0; i< listdrop.length; i++){
            rel -= listdrop[i];
            if (rel <= 0) {
                retour=true;
                res=i;
                break;
            }
        }
        if (retour==false){
            System.out.println("giga erreur mon sauce");
            return 0;
        }
        else{
            return res;
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

    public void inserttypecard(int idc,String nom, int rarity, String description) {
        String sql = "INSERT INTO type_card(idc,nom,rarity,description) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idc);
            pstmt.setString(2, nom);
            pstmt.setInt(3, rarity);
            pstmt.setString(4, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertplayer(int idp, String nom, int level, int xp, int money){
        String sql = "insert into player(idp,nom,level,xp,money) values (?,?,?,?,?)";
        try(Connection conn =this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,idp);
            pstmt.setString(2, nom);
            pstmt.setInt(3,level);
            pstmt.setInt(4,xp);
            pstmt.setInt(5,money);
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public void ajoutecard(int  idc, int nombre, int idp){
        String sqlaj =
        "insert into cards select 22,0,0,0,1 where not exists (select * from cards where idc=22 and idp=1);";
        String sqlup=
        "update cards set nombre=(select nombre from cards where idc=22 and idp=1)+1 where idc=22 and idp=1;";
        try(Connection conn =this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlaj); PreparedStatement pstmt2 = conn.prepareStatement(sqlup)){
            pstmt.executeUpdate();
            pstmt2.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fct app = new fct();
        app.ajoutecard(12,1,1);
    }
}

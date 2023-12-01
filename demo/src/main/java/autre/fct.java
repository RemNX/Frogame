package autre;
import java.util.Random;

import objets.type_card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import objets.stocklists;


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

    public static void main(String[] args) {
        fct app = new fct();
        int a = 0;
        for (type_card[] i :stocklists.listtype){
            for (type_card j : i){
                a+=1;
                app.inserttypecard(a,j.getname(),j.getnrarity(),j.getdesc());
            }
        }
    }
}

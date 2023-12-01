package interface_graphique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import objets.card;
import objets.player;
import objets.stocklists;

import java.awt.*;

public class tableaffichage {
    public static player choix = stocklists.listplayer[0];
    //,liste cartes d'un joueur
    public static final String[] columns = {"name","rarity","nombre"};
    public static DefaultTableModel modeltable = new DefaultTableModel(columns,0); //model table
    private JTable table = new JTable(modeltable);      //creation du table
    private JPanel mainPanel = new JPanel(new BorderLayout());      //panel du table


    // ,Bouton pour rajouter une carte et refresh
    public tableaffichage(){


        mainPanel.add(new JScrollPane(table),BorderLayout.CENTER);
        }

    public JComponent getComponent() {
        return mainPanel;
    }

    public static void refreshtable(){
        modeltable.setRowCount(0);
        ArrayList<card> cardj = choix.getcards();
        for (int i=0;i<cardj.size();i++){
            modeltable.addRow(
                new Object[]{
                    cardj.get(i).gettype().getname(),
                    cardj.get(i).gettype().getnrarity(),
                    cardj.get(i).getnombre()
                });
        }
    }

}

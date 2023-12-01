package com.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

import interface_graphique.tableaffichage;
import interface_graphique.tirage;
import interface_graphique.menu_choix_joueur;


public class Main {
    public static void main(String[] args) {
        //1 squelette
        JFrame frame = new JFrame("jeu");
        frame.setLayout(new GridLayout(1, 1));


        //1 onglet profil
        JPanel pprofil = new JPanel();

        //1 onglet collection
        JPanel pcollection = new JPanel();
        tableaffichage.refreshtable();
        pcollection.add(new menu_choix_joueur().getComponent());
        pcollection.add(new tableaffichage().getComponent());


        //1 onglet tirage
        JPanel ptirage = new JPanel();
        ptirage.add(new tirage().getComponent());



        //1 Main
        JTabbedPane onglets = new JTabbedPane();
        onglets.setBounds(40,20,300,300);
        onglets.add("profil",pprofil);
        onglets.add("collection",pcollection);
        onglets.add("tirage",ptirage);
        //3 refresh collection
        onglets.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                tableaffichage.refreshtable();
            }
        }
        );
        frame.add(onglets);


        frame.pack();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        System.out.print("\033[H\033[2J");
        System.out.flush();

        //sstocklists.listplayer[0].ajoute(stocklists.listtype[1][0],1);
        //stocklists.listplayer[0].ajoute(stocklists.listtype[0][1],300);
        //stocklists.listplayer[1].ajoute(stocklists.listtype[4][0],1);

    }
}
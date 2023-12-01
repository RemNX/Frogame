package interface_graphique;

import javax.swing.*;

import objets.player;
import objets.stocklists;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_choix_joueur {

    public static JLabel label = new JLabel();
    private JPanel mainPanel = new JPanel(new BorderLayout());


    public menu_choix_joueur(){
        JPanel listpanel = new JPanel();
        player[] lang = stocklists.listplayer;
        JComboBox<player> cb = new JComboBox<>(lang);
        listpanel.add(cb);

        cb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                player selec = (player) cb.getSelectedItem();
                tableaffichage.choix=selec;
                label.setText(selec.getname());
                tableaffichage.refreshtable();

            }
        });
        mainPanel.add(label, BorderLayout.CENTER);
        mainPanel.add(listpanel, BorderLayout.SOUTH);

    }
    public JComponent getComponent() {
        return mainPanel;
    }

}

package interface_graphique;

import javax.swing.*;

import objets.player;
import objets.stocklists;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tirage {
    private JPanel mainPanel = new JPanel(new BorderLayout());
    public static player choix = stocklists.listplayer[0];
    public static JLabel affichage = new JLabel();

    public tirage() {
        /* #region //?----Boutons boosters---*/
        JButton btnsim = new JButton("si");
        JButton btnup = new JButton("up");
        JButton btnle = new JButton("le");
        JButton btnul = new JButton("ul");

        JPanel btnpanel = new JPanel();
        btnpanel.add(btnsim);
        btnpanel.add(btnup);
        btnpanel.add(btnle);
        btnpanel.add(btnul);

        // ?Listener bouton
        btnsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choix.openbooster(0);
            }
        });
        btnup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choix.openbooster(1);
            }
        });
        btnle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choix.openbooster(2);
            }
        });
        btnul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choix.openbooster(3);
            }
        });
        /* #endregion */

        mainPanel.add(btnpanel, BorderLayout.CENTER);
        mainPanel.add(affichage, BorderLayout.SOUTH);
    }

    public JComponent getComponent() {
        return mainPanel;
    }
}

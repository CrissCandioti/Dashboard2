/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Principal;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Complementos.EventMenu;
import vista.Complementos.MainForm;
import vista.Complementos.MenuItem;
import vista.Paneles.LoginPanel;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        //Los utilizamos para que el programa se ejecute en el centro de la pantalla
        setLocationRelativeTo(null);
        //Llamamos al metodo que cambie el tema
        mode();
        menu2.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {

            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
                if (mainForm != null) {
                    if (index == 0 && subMenuIndex == 0) {
                        System.out.println(index + " " + subMenuIndex);
                        mainForm.displayForm(new LoginPanel());
                    }
                } else {
                    // Manejar el caso en el que mainForm es nulo
                    System.err.println("mainForm is null");
                }
            }
        });
        //Lo utilizamos para que el programa inicie seleccionando el primer item del menu.
        menu2.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenuPanel1 = new vista.Complementos.SubMenuPanel();
        menu2 = new vista.Complementos.Menu();
        jLabel2 = new javax.swing.JLabel();
        menuItem1 = new vista.Complementos.MenuItem();
        menuItem2 = new vista.Complementos.MenuItem();
        menuItem3 = new vista.Complementos.MenuItem();
        menuItem4 = new vista.Complementos.MenuItem();
        menuItem5 = new vista.Complementos.MenuItem();
        mainForm1 = new vista.Complementos.MainForm();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItemModoTheme = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subMenuPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));
        subMenuPanel1.setForeground(new java.awt.Color(255, 255, 255));
        subMenuPanel1.setOpacity(1.0F);

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.setMainForm(mainForm1);
        menu2.setOpacity(1.0F);
        menu2.setSubMenuPanel(subMenuPanel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/logo.png"))); // NOI18N
        menu2.add(jLabel2);

        menuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/menu1.png"))); // NOI18N
        menuItem1.setText("menuItem1");
        menuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "vista/Iconos/s1_1.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "VideoJuegos" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu2.add(menuItem1);

        menuItem2.setBackground(new java.awt.Color(35, 171, 234));
        menuItem2.setForeground(new java.awt.Color(242, 31, 154));
        menuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/menu2.png"))); // NOI18N
        menuItem2.setText("menuItem2");
        menu2.add(menuItem2);

        menuItem3.setBackground(new java.awt.Color(113, 66, 221));
        menuItem3.setForeground(new java.awt.Color(203, 209, 48));
        menuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/menu3.png"))); // NOI18N
        menuItem3.setText("menuItem3");
        menu2.add(menuItem3);

        menuItem4.setBackground(new java.awt.Color(16, 79, 163));
        menuItem4.setForeground(new java.awt.Color(12, 158, 158));
        menuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/menu4.png"))); // NOI18N
        menuItem4.setText("menuItem4");
        menu2.add(menuItem4);

        menuItem5.setBackground(new java.awt.Color(3, 33, 153));
        menuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Iconos/menu5.png"))); // NOI18N
        menuItem5.setText("menuItem5");
        menu2.add(menuItem5);

        jMenu2.setText("Opciones");

        jCheckBoxMenuItemModoTheme.setText("Mode Theme");
        jMenu2.add(jCheckBoxMenuItemModoTheme);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subMenuPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //FlatMacDarkLaf.setup();
        FlatMacLightLaf.setup();
        //FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private void mode() {
        jCheckBoxMenuItemModoTheme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBoxMenuItemModoTheme.isSelected()) {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatMacDarkLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                } else {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatMacLightLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemModoTheme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private vista.Complementos.MainForm mainForm1;
    private vista.Complementos.Menu menu2;
    private vista.Complementos.MenuItem menuItem1;
    private vista.Complementos.MenuItem menuItem2;
    private vista.Complementos.MenuItem menuItem3;
    private vista.Complementos.MenuItem menuItem4;
    private vista.Complementos.MenuItem menuItem5;
    private vista.Complementos.SubMenuPanel subMenuPanel1;
    // End of variables declaration//GEN-END:variables
}

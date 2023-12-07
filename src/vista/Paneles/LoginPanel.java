/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Paneles;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author criss
 */
public class LoginPanel extends JPanel{
    private JTextField JTextFieldUsuario;
    private JPasswordField JPasswordFieldContraseña;
    private JCheckBox CheckboxRecordar;
    private JButton JButtonEntrar;

    public LoginPanel() {
        init();
    }  
    
    private void init() {
        try {
            setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
            JTextFieldUsuario = new JTextField();
            JPasswordFieldContraseña = new JPasswordField();
            CheckboxRecordar = new JCheckBox("Recordar Usuario");
            JButtonEntrar = new JButton("Entrar");
            JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "arc:20;");
            JPasswordFieldContraseña.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");
            JTextFieldUsuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su nombre");
            JPasswordFieldContraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su contraseña");
            JLabel JLabel1 = new JLabel("Bienvenidos");
            JLabel1.putClientProperty(FlatClientProperties.STYLE, "" + "font:bold +10");
            JLabel JLabel2 = new JLabel("Por favor ingrese secion para poder continuar");
            JLabel2.putClientProperty(FlatClientProperties.STYLE, "");
            panel.add(JLabel1);
            panel.add(JLabel2);
            panel.add(new JLabel("Nombre"), "gapy 8");
            panel.add(JTextFieldUsuario);
            panel.add(new JLabel("Contraseña"), "gapy 8");
            panel.add(JPasswordFieldContraseña);
            panel.add(CheckboxRecordar, "grow 0");
            panel.add(JButtonEntrar, "gapy 10");
            /**
             * Metodo para crear un JComboBox y agregarlo ademas de obtener su informacion con un getSelectedItem
             * estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Administrador", "Invidato"})); 
             * 
             * panel.add(estado);
             */
            panel.add(registroUsuarioNuevo());
            add(panel);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /*
     * Este metodo me retorna un "Componente" la cual puedo utilizar para
     * agregar al panel con el que estamos trabajando
     */
    private Component registroUsuarioNuevo() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, "" + "background:null");
        JButton entrarRegistro = new JButton("<html><a href=\"#\">Registrate</a></html>");
        entrarRegistro.putClientProperty(FlatClientProperties.STYLE, "" + "border:3,3,3,3");
        entrarRegistro.setContentAreaFilled(false);
        entrarRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JLabel titulo = new JLabel("No tienes una cuenta?");
        titulo.putClientProperty(FlatClientProperties.STYLE, "");
        panel.add(titulo);
        panel.add(entrarRegistro);
        return panel;
    }
}



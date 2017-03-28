/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dokxo
 */
public class FormSync extends JPanel{
    private JPanel root;
    private JPanel title;
    private JPanel body;
    
    private JLabel lblTitle;
    private JLabel lblIp;
    private JLabel lblCode;
    
    
    private JTextField txtIp;
    private JTextField txtCode;
   
    
    public FormSync(JTextField txtIp ,JTextField txtCode){
        super();
    root= new JPanel(new BorderLayout());
    title= new JPanel(new FlowLayout());
    title.setBackground(Color.blue);
    
    body= new JPanel(new GridLayout(5,2,5,5));
    body.setBackground(Color.white);
    lblTitle = new JLabel(" S  I  N  C  R  O  N  I  Z  A  R ");
    lblTitle.setForeground(Color.WHITE);
   lblIp= new JLabel("IP: ");
   lblCode= new JLabel("Codigo Sync: ");
    
    this.txtIp = txtIp;
    this.txtCode = txtCode;
    
    root.add(title,BorderLayout.NORTH);
    root.add(body,BorderLayout.CENTER);
    
    title.add(lblTitle);
    
    body.add(lblIp); body.add(txtIp);
    body.add(lblCode); body.add(txtCode);
    
    add(root);
    this.repaint();
    
    }
    public FormSync(String n,String m){
    this(new JTextField(n),new JTextField(m));
    }
    public FormSync(){
    this("ingresa texto","ingresa texto");
    }
    
            
    
}


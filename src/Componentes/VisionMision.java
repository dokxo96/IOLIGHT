/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dokxo
 */

public class VisionMision extends JPanel{
    private JTextArea  Texto;
    private JPanel  pnl;
    VisionMision(JTextArea Texto){
        super();
        super.setEnabled(false);
    pnl= new JPanel(new BorderLayout());
    pnl.setOpaque(false);
    this.Texto=Texto;
    Texto.setForeground(Color.white);
    pnl.add(Texto,BorderLayout.CENTER);
    add(pnl);
    this.repaint();
    }
    public VisionMision(String n){
    this(new JTextArea(n));
    }
    public VisionMision(){
    this("Mision: \n\n" +
"En este proyecto nos vemos involucrados  con el compromiso \n"
+ "del cuidado del medio ambiente y los recursos económicos\n"
+ "ya sea de los hogares o empresas mexicanas mediante la \n"
+ "implementación de un sistema que permita el control del \n"
+ "gasto energético de forma inteligente.\n\n" +
            
"Vision:\n\n" +
"se plantea que mediante este sistema a largo plazo reduzca \n"
+ "eficientementelos costos energéticos y su continua mejora \n"
+ "previendo de un control cada vez mas inteligente y así\n "
+ "poder ayudar ya sea a las familias o empresas mexicanas.\n\n"+
"Valores:\n\n"
+ "nosotros como empresa nos regiremos actualmente enfocados a\n"
+ "la preservación del medio ambiente y a su vez cuidando\n "
+ "todos los valores como el respeto ,la tolerancia y la honestidad.\n");
    }
}

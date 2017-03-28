/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author dokxo
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class IconoTec extends JPanel  {
   @Override
    public void paintComponent(Graphics g){
        
     Dimension tam=getSize();
     ImageIcon ImagenesIoligth = new ImageIcon(new ImageIcon(getClass()
             .getResource("/Images/itt.png")).getImage());
     g.drawImage(ImagenesIoligth.getImage(),0,0,tam.width,tam.height,null);
     
    
 }
}

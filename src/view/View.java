/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SuperNatural
 */
public class View extends JFrame{
    JPanel p[]=new JPanel[5];
    JButton b[]=new JButton[5];
    JLabel l[]=new JLabel[2];
    View()
    {
       setLayout(new GridLayout(3,1));
       for(int i=0;i<4;i++) p[i]=new JPanel();
       for(int i=0;i<5;i++) b[i]=new JButton();
       for(int i=0;i<2;i++) l[i]=new JLabel();
       p[0].add(new JLabel("CCTV student information system"));
       p[1].setLayout(new GridLayout(1,3));
       for(int i=0;i<3;i++) 
       {
            
       }
       add(p[0]);
       add(p[1]);
       p[2].add(p[3]);
       p[2].add(p[4]);
       add(p[2]);
       
       
    }
    
}

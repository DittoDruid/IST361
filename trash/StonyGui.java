/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stony;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Component.*;
import javax.swing.JComponent.*;
/**
 *
 * @author Zack
 */
public class StonyGui extends JFrame implements ActionListener 
{
    
    private Container contentPane;
    private JPanel loginPanel;
    private JLabel loginPrompt, passPrompt;
    private JTextField login, password;
public StonyGui (String title)
   {
        buildGUI();
        setTitle(title);
        setSize(600,400);	
        setVisible(true);		
        setResizable(false);
        setLocation(75,15);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }// end GuessTheNumberGUI
    
   private void buildGUI()
   {
        contentPane = getContentPane(); 
        buildLoginPanel();
   } 
   
   private void buildLoginPanel()
   {
       loginPanel = new JPanel();
       loginPanel.setLayout(new BorderLayout());
        //titlePanel.setOpaque(false);
       loginPanel.setBackground(Color.blue);
       loginPrompt = new JLabel("Please Enter Login ID");
       passPrompt = new JLabel ("Please Enter Password");
       loginPanel.add("North", loginPrompt);
       
   }
   
   public void actionPerformed(ActionEvent e)
    {

    }
}



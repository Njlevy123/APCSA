/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author nlevy2025
 */
import java.awt.*;
import javax.swing.*;
       // Create a constructor method
public class Main extends JPanel{
    public Main(){
        super();
    }
    /* Create a paintComponent() method to override the one in
    JPanel.This is where the drawing happens. We don't have
    to call it in our program, it gets called automatically
    whenever the panel needs to be redrawn, like when it is
    made visible or moved or whatever.
    */
    public void paintComponent(Graphics g){
      
        g.drawRect(200, 200, 100, 20);
        g.drawOval(200, 150, 30, 30);
         g.drawOval(260, 150, 30, 30);
        g.drawOval(145, 80, 200, 200);
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
// Create a new identifier for a BasicJPanel called "panel",
// then create a new BasicJPanel object for it to refer to.
        Main panel = new Main();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

    
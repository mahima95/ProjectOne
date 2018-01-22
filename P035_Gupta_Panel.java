/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author mahimagupta
 */
public class P035_Gupta_Panel implements Runnable {

 
       
        JFrame frame;
	JPanel panel;
	JLabel labelName;
	JLabel timeLabel;
	Integer counter=0;
	P035_Gupta_Panel(int val)  
        {  
	
      // creating labels
        labelName = new JLabel("<html>Mahima<br>Gupta</html>"); //JPanel with full namelabel,first namelabel on first row and last namelabel on the next row.
        timeLabel= new JLabel("");
        
        //Resetting the font for both the variables
        labelName.setFont(new Font("Papyrus", Font.BOLD, 15));
        timeLabel.setFont(new Font("Papyrus", Font.BOLD, 15));
        
        //creating frame and panel
        
        frame= new JFrame("Group 2");                        
        panel=new JPanel();
        
        //Giving attributes to frame and panel
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);  
        frame.setSize(400,400);    
        frame.setLayout(null);    
        frame.setVisible(true);
        
        panel.setSize(100,100); 
        
        /*Checking if integer passed is not even, means it's odd so set 
        background t light blue */
        
       if(val%2==0) {

			panel.setBackground(Color.WHITE);
                     }
		
        else         {
			panel.setBackground(new Color(173,216,230));
		}

        panel.add(labelName);
        panel.add(timeLabel);
       
        Thread t = new Thread(this);
        t.start();
        
        
        
       
        } 
	
        public static void main(String args[])  
        {  
        
        	 new P035_Gupta_Panel(2);
        	
        }

		@Override
		public void run() {
			
			while(true){
	            try{
                        if(counter <10)
                        { Thread.sleep(1000);
                            timeLabel.setText("            "+counter.toString()); //JLabel displaying numbers from 0-9
                            
	               
	                counter++;
	                
                        }
                        else counter=0;
                        
	            }       catch (InterruptedException ex) {
                                Logger.getLogger(P035_Gupta_Panel.class.getName()).log(Level.SEVERE, null, ex);
                                 System.out.println("Error! Stopping the timer...");
                            }
	               //    
	            }
	            }
	        }
	   
			
		  

	

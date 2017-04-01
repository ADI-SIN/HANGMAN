import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class v2 extends JFrame {

	private JTextField fword;
	private JTextField fhint;
	private int z;
	private String hint;
	private char guess;
	
	
	
	public v2()
	{
		super( "######  HANGMAN_v2.0 ###### ");
		setLayout(new FlowLayout());
		

		JButton msg= new JButton(new AbstractAction("  HOW TO PLAY  "){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(getParent(), "This is a simple game that works on core java.\nYou have to guess the word, you can take the hint by pressing GET HINT button\nThen you have to enter the guess by clicking on ENTER YOUR GUESS button.\n\n\nDeveloper : ADITYA SINGH");
			}
      }
						 
						 );
     
     
      Random rand= new Random();
      z=rand.nextInt(10);
       
        StringBuilder answer= new StringBuilder("*****");
	    String wordarray[]= {"liver","assam","point","start","class","datum","cross","devil","learn","stump"};
	    String word= wordarray[z];
	    
		fword = new JTextField("\t\tUNLOCK IT  : *****",50);
		fword.setBackground(Color.YELLOW);
		add(fword);
		
		fhint = new JTextField("\t\tHINT  : ",70);
		fhint.setBackground(Color.GREEN);
		add(fhint);
		
		 add(msg);
		
		JButton hnt= new JButton(new AbstractAction("  GET HINT "){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				  switch (z)
				    {
				    case 0 : hint=(" \t\tHINT: the largest gland of human body");
				              break;
				    case 1 : hint=(" \t\tHINT: a state of india famous for its tea production");
		                      break;          
				    case 2 : hint=(" \t\tHINT: it has no dimensions");
		                      break; 
				    case 3 : hint=(" \t\tHINT: a synonym of 'beginning'");
		                      break; 
				    case 4 : hint=(" \t\tHINT: it contains 'objects' in OOP");
		                      break;
				    case 5 : hint=(" \t\tHINT: singular of data");
		                      break;
				    case 6 : hint=(" \t\tHINT: X");
		                      break;
				    case 7 : hint=(" \t\tHINT: name of Salman Khan in one of his movies");
		                      break;
				    case 8 : hint=(" \t\tHINT: _______ how to earn : English Saying");
		                    break;
				    case 9 : hint=(" \t\tHINT: i break that..when i bowl");
		                     break;
		                      
		            default:  hint=("\t\tNo hints available for this word");
		                      break;
		             
				    }
				
				fhint.setText(hint);
			}
      }
						 
						 );
      add(hnt);
      
      JButton enter=new JButton(new AbstractAction(" ENTER YOUR GUESS "){
    	  
    	  public void actionPerformed(ActionEvent arg0){
      
      String guesss=JOptionPane.showInputDialog(getParent(),"ENTER THE GUESS : ");
      guess=guesss.charAt(0);
      
      for(int j=0;j<8;j++)
      {
      for(int i=0;i<word.length();i++)
      {
			
     	 char a= word.charAt(i);
        if(a==guess)
     	answer.setCharAt(i,guess);
       
		 } 
      
      fword.setText("\t\tNow the word is : "+answer);
      
      if(answer.toString().trim().equals(word.trim())){
    	  JOptionPane.showMessageDialog(getParent()," CONGRATULATIONS !!......YOU WON");
    	  
    	  setVisible(false);
    	  break;
      }
      
      
     }
      
    	  }
    	  
       }
          );
      
     
      add(enter);
      
     
		
	}
}

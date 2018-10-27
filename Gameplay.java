import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
import java.awt.event.WindowAdapter; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Gameplay implements ActionListener
{  
    
   
    
 

    
        
       
    Gameplay()
    {  
       JFrame frame = new JFrame("Hangman");
       JMenuBar mb=new JMenuBar();  
        JMenu menuGame=new JMenu("Game");  
        JMenu menuAbout=new JMenu("About");  
        
        JMenuItem newgame = new JMenuItem("New game");
        newgame.addActionListener(this);
        
        JMenuItem score=new JMenuItem("Highscore");
        score.addActionListener(this);
        
        JMenuItem about=new JMenuItem("About");
        about.addActionListener(this);
        
        JMenuItem help=new JMenuItem("Help");  
        help.addActionListener(this);  
        
        
        menuGame.add(newgame);
        menuGame.add(score);
        
        menuAbout.add(about);  
        menuAbout.add(help);
        
      
        mb.add(menuGame);
        mb.add(menuAbout);
        
        frame.setJMenuBar(mb); 
       JPanel cards;
       
       //Create the "cards".
        JPanel cardIndex = new JPanel();
        
        JPanel cardHelp = new JPanel();
        
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(cardIndex);
        cards.add(cardHelp);
       
       
       
        
       cardIndex.setLayout(new FlowLayout());  
       JLabel label = new JLabel("Index ");  
       cardIndex.add(label);  
        
       
       cardHelp.setLayout(new FlowLayout());  
       JLabel label1 = new JLabel("Help ");  
       cardHelp.add(label1); 
       
       frame.add(cards);  
        
       
       
       
       
       frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           
        
          
        frame.setLayout(null);  
        frame.setVisible(true);
        
    }  
    
    public void actionPerformed(ActionEvent e) 
    {    
        if(e.getActionCommand().equals("Help"))    
        {
            System.out.println("help clicked");  
            
        }  
    }     
}  
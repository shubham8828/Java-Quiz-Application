package Quiz;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
		int b,g;
		JButton equal,submit;
    Score(String name, int scoregirl,int scoreboy) {
    	this.b=scoreboy;
    	this.g=scoregirl;
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel(name + ", Thank you for submitting answers.");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
                
        JLabel lblscore = new JLabel("Boys Score is " + scoreboy);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JLabel lblscore1 = new JLabel("Girls Score is " + scoregirl);
        lblscore1.setBounds(350, 240, 300, 30);
        lblscore1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore1);
        
        submit = new JButton("Play Again");
        submit.setBounds(320, 300, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
       
        
       
        setVisible(true);
        setLocation(100,100);
    }
    
    public void actionPerformed(ActionEvent e) {
    	 if(e.getSource()==submit) {
    		 setVisible(false);
    	     new Login();
    	 }
    }
}

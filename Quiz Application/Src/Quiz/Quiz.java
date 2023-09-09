package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[20][5];
    String answers[][] = new String[20][2];
    String useranswers[][] = new String[20][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int scoreboy = 0;
    public static int scoregirl = 0;

    String name;
    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 350);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 400, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 400, 950, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Who invented Java Programming?";
        questions[0][1] = "Guido van Rossum";
        questions[0][2] = "James Gosling";
        questions[0][3] = "Dennis Ritchie";
        questions[0][4] = "Bjarne Stroustrup";
        
        questions[1][0] = "How many types of loops in java?";
        questions[1][1] = "2 types";
        questions[1][2] = "3 types";
        questions[1][3] = "4 types";
        questions[1][4] = "5 types";
        
        questions[2][0] = "How many types of comments in java?";
        questions[2][1] = "2 types";
        questions[2][2] = "3 types";
        questions[2][3] = "4 types";
        questions[2][4] = "5 types";

        questions[3][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[3][1] = "Stack";
        questions[3][2] = "String memory";
        questions[3][3] = "Random storage space";
        questions[3][4] = "Heap memory";
        
        questions[4][0] = "What is Truncation in Java?";
        questions[4][1] = "Floating-point value assigned to a Floating type";
        questions[4][2] = "Floating-point value assigned to an integer type";
        questions[4][3] = "Integer value assigned to floating type";
        questions[4][4] = "Integer value assigned to floating type";
        
        questions[5][0] = "Which of these are selection statements in Java?";
        questions[5][1] = "break";
        questions[5][2] = "continue";
        questions[5][3] = "for()";
        questions[5][4] = "if()";
  
        questions[6][0] = "Which of these keywords are used for the block to be check for exceptions?";
        questions[6][1] = "throw";
        questions[6][2] = "trows";
        questions[6][3] = "try";
        questions[6][4] = "catch";
        
        questions[7][0] = "A switch case statement in java is a _____ control statement.";
        questions[7][1] = "Iteration";
        questions[7][2] = "Loop";
        questions[7][3] = "Flow";
        questions[7][4] = "Selection";
        
        questions[8][0] = "What is function of javap command?";
        questions[8][1] = "This command is used for run the java compiler.";
        questions[8][2] = "This command is used for run the java file.";
        questions[8][3] = "This command to create an API";
        questions[8][4] = "A commond to separate java class file.";
        
        questions[9][0] = "String s ='AB:'+1+2+3; System.out.print(s); ";
        questions[9][1] = "Error";
        questions[9][2] = "AB:6";
        questions[9][3] = "AB:+1+2+3";
        questions[9][4] = "AB:123";

        questions[10][0] = "int a=10,x=20,y=30; boolean b=(a>y && y>x); System.out.print(b);";
        questions[10][1] = "true";
        questions[10][2] = "false";
        questions[10][3] = "20";
        questions[10][4] = "30";
        
        questions[11][0] = "int y=20,z=30; System.out.print("+"'x'" +"+y+z)";
        questions[11][1] = "x50";
        questions[11][2] = "x2030";
        questions[11][3] = "x3020";
        questions[11][4] = "None";
        
        questions[12][0] = "int a=10,b=20,c=30; System.out.println((a>b)?(a>c?a:c):(b>c?b:c));";
        questions[12][1] = "10";
        questions[12][2] = "20";
        questions[12][3] = "30";
        questions[12][4] = "None";
        
        questions[13][0] = "Which are the not a correct way to calling a constructor?";
        questions[13][1] = "A a=new A();";
        questions[13][2] = "A a=new A(x);";
        questions[13][3] = "new A();";
        questions[13][4] = "None";
        
        questions[14][0] = "How many types of polymorphism in java?";
        questions[14][1] = "2 types";
        questions[14][2] = "3 types";
        questions[14][3] = "4 types";
        questions[14][4] = "None";
        
        questions[15][0] = "We can achieve the polymorphism______.";
        questions[15][1] = "Method overriding";
        questions[15][2] = "Method overloading";
        questions[15][3] = "Method overriding & Method overloading";
        questions[15][4] = "None";
        
        questions[16][0] = "Which are the correct way to assing to single value in multiple variables?";
        questions[16][1] = "int a=b=c=10;";
        questions[16][2] = "int a,b,c; a=b=c=10;";
        questions[16][3] = "option I & II both ";
        questions[16][4] = "None";
        
        questions[17][0] = "int a=b=c=20; System.out.print(b);";
        questions[17][1] = "10";
        questions[17][2] = "20";
        questions[17][3] = "Error";
        questions[17][4] = "None";
        
        questions[18][0] = "Method overriding & Method overloading come are come under______polymorphism.";
        questions[18][1] = "Compile time";
        questions[18][2] = "Run time";
        questions[18][3] = "Execution time";
        questions[18][4] = "None";
        
        questions[19][0] = "int y=10,z=20; System.out.print("+"'x'" +"+(y+z))";
        questions[19][1] = "x30";
        questions[19][2] = "x2010";
        questions[19][3] = "x1020";
        questions[19][4] = "None";
        
        answers[0][1] = "James Gosling";
        answers[1][1] = "4 types";
        answers[2][1] = "3 types";
        answers[3][1] = "Heap memory";
        answers[4][1] = "Floating-point value assigned to an integer type";
        answers[5][1] = "if()";
        answers[6][1] = "try";
        answers[7][1] = "Selection";
        answers[8][1] = "A commond to separate java class file.";
        answers[9][1] = "AB:123";
        answers[10][1]= "false";
        answers[11][1]= "x2030";
        answers[12][1]= "30"; 
        answers[13][1]= "None"; 
        answers[14][1]= "2 types"; 
        answers[15][1]= "Method overriding & Method overloading"; 
        answers[16][1]= "int a,b,c; a=b=c=10;"; 
        answers[17][1]= "Error"; 
        answers[18][1]= "Run time"; 
        answers[19][1]= "x30"; 


        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 450, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 490, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 530, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 570, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1000, 480, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);{
        	
        }
                
        submit = new JButton("Submit");
        submit.setBounds(1000, 580, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        setVisible(true);
        setSize(1280,680);
        setLocation(0,0);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 18) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);}
        
         else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                	if(i%2==0) {
                		scoregirl += 2;
                    }else {
                    	scoreboy+=2;
                    }
                    opt1.setForeground(Color.green);
                } else {
                    scoreboy += 0;
                    scoregirl += 0;
                }
            }
            setVisible(false);
            new Score(name, scoregirl,scoreboy);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; 
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 950, 410);
        } else {
            g.drawString("Times up!!", 1000, 410);
        }
        
        timer--;
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 18) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 19) { 
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
              
                        scoreboy += 2;
                        scoregirl+=2;
                    } else {
                        scoreboy += 0;
                        scoregirl+=0;
                    }
                }
                setVisible(false);
                new Score(name, scoregirl,scoreboy);
            } else {
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
        
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
       
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
}


package calculator2;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Calculator2{
    public static void main(String[] args){
        new Calc();     
    }    
}
 class Calc extends JFrame implements ActionListener,KeyListener
 {
	private static final long serialVersionUID = 1L;
	JTextField J;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    String str;
    char str1;
    int sum,prev,next,rev,mod,div,p,a,k,s,w=0;
	 int g;
	 Font font1;
	private ScriptEngine engine;
    public Calc()
    {
    setLayout(null);    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     J=new JTextField("");
    J.setBounds(10,20,363,110);
    J.addFocusListener(new FocusListener());
    J.setBackground(Color.black);
    J.requestFocusInWindow();
    J.setEditable(false);  
    font1 = new Font("SansSerif", Font.BOLD, 60);
   J.setForeground(Color.white);
    J.setFont(font1);
    J.addKeyListener(this);
    J.getCaretPosition();
       b1=new JButton("1");
    b1.setBounds(15,170,45,45);
    b1.addActionListener(this);
    b1.addKeyListener(this);
      b2=new JButton("2");
        b2.setBounds(80, 170, 45, 45);
       b2.addActionListener(this);
       b2.addKeyListener(this);
        b3=new JButton("3");
        b3.setBounds(145, 170, 45, 45);
        b3.addActionListener(this);
        b3.addKeyListener(this);
        b4=new JButton("4");
        b4.setBounds(15, 250, 45, 45);
        b4.addActionListener(this);
        b4.addKeyListener(this);
        b5=new JButton("5");
        b5.setBounds(80, 250, 45, 45);
        b5.addActionListener(this);
        b5.addKeyListener(this);
        b6=new JButton("6");
        b6.setBounds(145, 250, 45, 45);
        b6.addActionListener(this);
        b6.addKeyListener(this);
        b7=new JButton("7");
        b7.setBounds(15, 330, 45, 45);
        b7.addActionListener(this);
        b7.addKeyListener(this);
        b8=new JButton("8");
        b8.setBounds(80, 330, 45, 45);
        b8.addActionListener(this);
        b8.addKeyListener(this);
        b9=new JButton("9");
        b9.setBounds(145, 330, 45, 45);
        b9.addActionListener(this);
        b9.addKeyListener(this);
        b10=new JButton(".");
        b10.setBounds(15, 410, 45, 45);
        b10.addActionListener(this);
        b10.addKeyListener(this);
        b11=new JButton("0");
        b11.setBounds(80, 410, 45, 45);
       b11.addActionListener(this);
       b11.addKeyListener(this);
        b12=new JButton("#");
        b12.setBounds(145, 410, 45, 45);
        b12.addActionListener(this);
        b12.addKeyListener(this);
        b13=new JButton("C");
        b13.addActionListener(this);
        b13.setBounds(245,170,45,45);
        b13.addKeyListener(this);
        b14=new JButton("D");
        b14.setBounds(315,170,45,45);
        b14.addActionListener(this);
        b14.addKeyListener(this);
        b15=new JButton("+");
        b15.setBounds(245, 250,45,45);
        b15.addActionListener(this);
        b15.addKeyListener(this);
        b16=new JButton("-");
        b16.setBounds(315, 250,45,45);
        b16.addActionListener(this);
        b16.addKeyListener(this);
         b17=new JButton("*");
        b17.setBounds(245, 330,45,45);
        b17.addActionListener(this);
        b17.addKeyListener(this);
         b18=new JButton("/");
        b18.setBounds(315, 330,45,45);
        b18.addActionListener(this);
        b18.addKeyListener(this);
         b19=new JButton("=");
        b19.setBounds(315, 410, 45, 45);
        b19.addActionListener(this);
        b19.addKeyListener(this);
         b20=new JButton("..");
        b20.setBounds(245, 410,45,45);
        b20.addActionListener(this);
        b20.addKeyListener(this);
        add(b1);
        add(J);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(J);
    setVisible(true);
    setSize(390 , 550);
    getContentPane().setBackground(Color.white); 
    setResizable(false);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    addWindowFocusListener(new WindowAdapter() {
	    public void windowGainedFocus(WindowEvent e) {
	        J.requestFocusInWindow();
	    }
	});
    }

    @Override
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1)
        J.setText(J.getText()+"1");
        else if(ae.getSource()==b2)
            J.setText(J.getText()+"2");
        else if(ae.getSource()==b3)
            J.setText(J.getText()+"3");
        else if(ae.getSource()==b4)
            J.setText(J.getText()+"4");
        else if(ae.getSource()==b5)
            J.setText(J.getText()+"5");
        else if(ae.getSource()==b6)
            J.setText(J.getText()+"6");
        else if(ae.getSource()==b7)
            J.setText(J.getText()+"7");
        else if(ae.getSource()==b8)
            J.setText(J.getText()+"8");
        else if(ae.getSource()==b9)
            J.setText(J.getText()+"9");
        else if(ae.getSource()==b10)
            J.setText(J.getText()+".");
        else if(ae.getSource()==b11)
            J.setText(J.getText()+"0");
        else if(ae.getSource()==b12)
            J.setText(J.getText()+"#");
        else if(ae.getSource()==b15)
            J.setText(J.getText()+"+");
        else if(ae.getSource()==b16)
            J.setText(J.getText()+"-");
        else if(ae.getSource()==b17)
            J.setText(J.getText()+"*");
        else if(ae.getSource()==b18)
        	J.setText(J.getText()+"/");
        else if(ae.getSource()==b20)
        	J.setText(J.getText()+"..");
        else if(ae.getSource()==b19)
        {
        
        	str=J.getText();
        	ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String foo = str;
            try {
				str=Integer.toString((int) engine.eval(foo));
			} catch (ScriptException e) {
				e.printStackTrace();
			}
        	J.setText(str);
        	str=null;
        
    }
        else if(ae.getSource()==b14)
        {
        	
          str=J.getText();
          StringBuffer sb=new StringBuffer(str);
          int i=str.length()-1;
          if(i>=0)
          sb.deleteCharAt(i);
          else {
          J.setText("");
          }
          str=sb.toString();
          J.setText(str);
          }
          else if(ae.getSource()==b13){
        	  str=J.getText();
        	  StringBuffer sb=new StringBuffer(str);
        	  for(int i=str.length()-1;i>=0;i--){
        		  sb.deleteCharAt(i);
        	  }
        	  str=sb.toString();
        	  J.setText(str);
          }
         

    }

	public ScriptEngine getEngine() {
		return engine;
	}

	public void setEngine(ScriptEngine engine) {
		this.engine = engine;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char d=e.getKeyChar();
		
		if(d=='+'){
		str=J.getText();
		str=str+'+';
		J.setText(str);
		}
		else if(d=='-') {
			str=J.getText();
			str=str+'-';
			J.setText(str);
		}
		else if(d=='*') {
			str=J.getText();
			str=str+'*';
			J.setText(str);
		}
		else if(d=='/') {
			str=J.getText();
			str=str+'/';
			J.setText(str);
		}
		else if(d=='.') {
			str=J.getText();
			str=str+'.';
			J.setText(str);
		}
		else if(d>='0'&&d<='9'){
			J.requestFocusInWindow();
			str=J.getText();
			str=str+d;
			J.setText(str);
		}
		else if(d==8){
			str=J.getText();
			StringBuffer sb=new StringBuffer(str);
			if(str.length()!=0)
			sb.deleteCharAt(str.length()-1);
			str=sb.toString();			
			J.setText(str);
		}
		else if(d==10){
			str=J.getText();
        	ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String foo = str;
            try {
				str=Integer.toString((int) engine.eval(foo));
			} catch (ScriptException e1){
				e1.printStackTrace();
			}
        	J.setText(str);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}



	
    
    }


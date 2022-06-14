//////////////////////////////////////////////////////////////////////////////////////////////
//
//	Calculator using GUI
//
//////////////////////////////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Arithmetic
{
	public int Addition(int iNo1, int iNo2)
	{
		int iAns = iNo1 + iNo2;
		return iAns;
	}
	
	public int Substraction(int iNo1, int iNo2)
	{
		int iAns = iNo1 - iNo2;
		return iAns;
	}
	
	public int Multiplication(int iNo1, int iNo2)
	{
		int iAns = iNo1 * iNo2;
		return iAns;
	}
	
	public float Division(int iNo1, int iNo2)
	{
		float iAns = (float)iNo1 / iNo2;
		return iAns;
	}
	
	public int Modulo(int iNo1, int iNo2)
	{
		int iAns = iNo1 % iNo2;
		return iAns;
	}
}

class Marvellous extends WindowAdapter implements ActionListener
{
	public Frame fobj;
	public TextField tobj1, tobj2, tobj3;
	public Label label1, label2, label3 , label4;
	public Button bobj1, bobj2, bobj3, bobj4, bobj5;
	
	public Marvellous(String name)
	{
		fobj = new Frame(name);
		tobj1 = new TextField();
		tobj2 = new TextField();
		tobj3 = new TextField();
		bobj1 = new Button("+");
		bobj2 = new Button("-");
		bobj3 = new Button("*");
		bobj4 = new Button("/");
		bobj5 = new Button("%");
		
		
		label1 = new Label("Enter First Number : ");
		label2 = new Label("Enter Second Number : ");
		label3 = new Label("Answer : ");
		label4 = new Label("Click For Operation : ");
		
		label1.setBounds(30, 30, 150, 20);
		tobj1.setBounds(50,50,300,30);
		label2.setBounds(30, 100, 150, 20);
		tobj2.setBounds(50,120,300,30);
		label3.setBounds(30, 170, 150, 20);
		tobj3.setBounds(50,190,300,30);
		label4.setBounds(30, 230, 150, 20);
		bobj1.setBounds(45, 250, 30, 30);
		bobj2.setBounds(80, 250, 30, 30);
		bobj3.setBounds(115, 250, 30, 30);
		bobj4.setBounds(150, 250, 30, 30);
		bobj5.setBounds(185, 250, 30, 30);
		
		fobj.add(label1);
		fobj.add(tobj1);
		fobj.add(label2);
		fobj.add(tobj2);
		fobj.add(label3);
		fobj.add(tobj3);
		fobj.add(label4);
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(bobj3);
		fobj.add(bobj4);
		fobj.add(bobj5);
		fobj.setLayout(null);
		
		fobj.setSize(500,500);
		fobj.setVisible(true);
		fobj.setBackground(Color.white);
		
		
		fobj.addWindowListener(this);
		bobj1.addActionListener(this);
		bobj2.addActionListener(this);
		bobj3.addActionListener(this);
		bobj4.addActionListener(this);
		bobj5.addActionListener(this);
	}
	
	public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent obj)
	{
		Arithmetic aobj = new Arithmetic();
		
		int iValue1 = Integer.parseInt(tobj1.getText());
		int iValue2 = Integer.parseInt(tobj2.getText());
		
		if(obj.getSource() == bobj1)
		{
			int iRet = 0;
			iRet = aobj.Addition(iValue1, iValue2);
			String ans = Integer.toString(iRet);
		
			tobj3.setText(ans);
		}
		else if(obj.getSource() == bobj2)
		{
			int iRet = 0;
			iRet = aobj.Substraction(iValue1, iValue2);
			String ans = Integer.toString(iRet);
		
			tobj3.setText(ans);
		}
		else if(obj.getSource() == bobj3)
		{
			int iRet = 0;
			iRet = aobj.Multiplication(iValue1, iValue2);
			String ans = Integer.toString(iRet);
		
			tobj3.setText(ans);
		}
		else if(obj.getSource() == bobj4)
		{
			float fRet = 0.0f;
			fRet = aobj.Division(iValue1, iValue2);
			String ans = Float.toString(fRet);
		
			tobj3.setText(ans);
		}
		else if(obj.getSource() == bobj5)
		{
			int iRet = 0;
			iRet = aobj.Modulo(iValue1, iValue2);
			String ans = Integer.toString(iRet);
		
			tobj3.setText(ans);
		}
			
	}
}

class Calculator
{
	public static void main(String arg[])
	{
		Marvellous mmobj = new Marvellous("CALCULATOR");
	}
}
package course.jse.basic.oop.ui.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Demo01OopWithAwt {

	public static void main(String[] args) {
	
		//demo01DefaultFrame();
		//demo02ManyFrames();
		//demo03ConfigureFrames();
		//demo04AddComponents_BadImpl();
		//demo05AddComponents_A_BetterImpl();
	}

	
	private static void demo01DefaultFrame(){
		
		Frame defaultFrame = new Frame();		
		defaultFrame.setVisible(true);
	}
	
	
	private static void demo02ManyFrames(){
		
		Frame aFrame1 = new Frame();		
		aFrame1.setVisible(true);
		
		Frame aFrame2 = new Frame();		
		aFrame2.setVisible(true);
		
		Frame aFrame3 = new Frame();		
		aFrame3.setVisible(true);		
	}
	
	
	private static void demo03ConfigureFrames(){
		
		Frame aFrame1 = new Frame();
		aFrame1.setSize(200, 300);
		aFrame1.setLocation(100, 50);
		aFrame1.setVisible(true);
		
		Frame aFrame2 = new Frame();
		aFrame2.setSize(100, 100);
		aFrame2.setLocation(500, 500);
		aFrame2.setVisible(true);
		
		Frame aFrame3 = new Frame();
		aFrame3.setSize(150, 240);
		aFrame3.setLocation(700, 700);
		aFrame3.setVisible(true);		
	}
	
	
	private static void demo04AddComponents_BadImpl(){
				
		Button btnOk = new Button("OK");
		Button btnCancek = new Button("CANCEL");	
		
		Frame aFrame1 = new Frame();
		aFrame1.setSize(400, 400);
		aFrame1.setLocation(100, 50);
		
		aFrame1.add(btnOk);
		aFrame1.add(btnCancek);
		
		aFrame1.setVisible(true);
				
	}
	
	
	private static void demo05AddComponents_A_BetterImpl(){
				
		Button btnOk = new Button("OK");
		Button btnCancek = new Button("CANCEL");	
		
		Panel panel = new Panel();
		panel.add(btnOk);
		panel.add(btnCancek);
		
		
		Frame aFrame1 = new Frame();
		aFrame1.setSize(400, 400);
		aFrame1.setLocation(100, 50);
		
		aFrame1.add(panel);		
		aFrame1.setVisible(true);
				
	}
	
}

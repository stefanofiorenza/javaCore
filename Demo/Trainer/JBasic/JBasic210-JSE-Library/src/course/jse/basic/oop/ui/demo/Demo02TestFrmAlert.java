package course.jse.basic.oop.ui.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import course.jse.basic.oop.ui.wins.FrmAlert;

public class Demo02TestFrmAlert {

	public static void main(String[] args) {
	
		FrmAlert alertWin1 = new FrmAlert("Normal","Something Bad Happened!");
		alertWin1.setVisible(true);
		
		FrmAlert alertWin2 = new FrmAlert("Severe","Something Extremely Bad Happened!");
		alertWin2.setVisible(true);
		
		FrmAlert alertWin3 = new FrmAlert("Critical","OMG!! We should react immediately to this!!");
		alertWin3.setVisible(true);
	
	}

	
	
	
}

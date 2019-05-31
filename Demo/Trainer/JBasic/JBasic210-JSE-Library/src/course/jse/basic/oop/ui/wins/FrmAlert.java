package course.jse.basic.oop.ui.wins;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class FrmAlert extends Frame {

	private Label lblSeverity;
	private Label lblMessage;
	private TextField txtUserAcknowledged;
	private Button btnOk;
	private Button btnCancel;
	private Panel mainPanel;
	
	private Label lblHeaderSeverity;

	public FrmAlert(){
		super();
		
	}
	
	
	public FrmAlert(String severity, String message){
		super();
		this.setTitle("Alert");
		this.setSize(280,170);
		this.setLocation(100, 50);
			
		this.lblHeaderSeverity=new Label("SEVERITY:");
		this.lblSeverity=new Label(severity);
		
		this.lblMessage= new Label(message);		
		this.btnOk = new Button("OK");
		this.btnCancel = new Button("Cancel");
		this.txtUserAcknowledged= new TextField(30);		
		this.mainPanel= new Panel();
		
		this.mainPanel.add(this.lblHeaderSeverity);
		this.mainPanel.add(this.lblSeverity);
		this.mainPanel.add(new Label("                 ")); // this is only for alignment
		this.mainPanel.add(this.lblMessage);
		this.mainPanel.add(this.txtUserAcknowledged);
		this.mainPanel.add(this.btnOk);
		this.mainPanel.add(this.btnCancel);		
		
		this.add(this.mainPanel);
	}
}

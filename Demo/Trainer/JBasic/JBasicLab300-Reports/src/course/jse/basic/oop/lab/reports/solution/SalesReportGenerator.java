package course.jse.basic.oop.lab.reports.solution;

import java.util.ArrayList;
import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public abstract class SalesReportGenerator {


	
	public abstract byte[] generateReport(List<SalesReport> data);
	
	
	public void saveReportAsBinary(byte[] data){
		System.out.println("Save data to Some storage");
	}
	

}

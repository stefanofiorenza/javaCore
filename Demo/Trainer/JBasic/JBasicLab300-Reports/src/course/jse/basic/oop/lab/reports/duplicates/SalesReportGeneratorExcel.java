package course.jse.basic.oop.lab.reports.duplicates;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public class SalesReportGeneratorExcel {

	
	
	public List<SalesReport> retrieveReportData(){
		System.out.println("fetched from DB...");
		return new ArrayList<>();
	}
	
	
	public byte[] generateReport(List<SalesReport> data){
		System.out.println("calculate report data and generate a binary version .EXCEL");
		return new byte[]{};
	}
		
	public void saveReportAsBinary(byte[] data){
		System.out.println("Save data to Some storage");
	}
	
}

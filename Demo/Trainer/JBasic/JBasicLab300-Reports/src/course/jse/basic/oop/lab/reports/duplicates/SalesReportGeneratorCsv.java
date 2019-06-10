package course.jse.basic.oop.lab.reports.duplicates;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public class SalesReportGeneratorCsv {
	
	public byte[] generateReport(List<SalesReport> data){
		System.out.println("calculate report data and generate a binary version .CSV");
		return new byte[]{};
	}
		
	public void saveReportAsBinary(byte[] data){
		System.out.println("Save data to Some storage");
	}
	
}

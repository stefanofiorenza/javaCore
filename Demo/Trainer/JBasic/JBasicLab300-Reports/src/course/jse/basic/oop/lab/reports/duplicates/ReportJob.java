package course.jse.basic.oop.lab.reports.duplicates;

import java.util.ArrayList;
import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public class ReportJob {

	
	public void executeJob(){
		
		List<SalesReport> reportData = retrieveReportData();
		
		// Awful code full of repetitions...
		SalesReportGeneratorCsv reportGeneratorCsv = new SalesReportGeneratorCsv();		
		byte [] dataAsCsvBytes = reportGeneratorCsv.generateReport(reportData);
		reportGeneratorCsv.saveReportAsBinary(dataAsCsvBytes);
		
		SalesReportGeneratorPdf reportGeneratorPdf = new SalesReportGeneratorPdf();
		byte [] dataAsPdfBytes = reportGeneratorPdf.generateReport(reportData);
		reportGeneratorPdf.saveReportAsBinary(dataAsPdfBytes);
		
		SalesReportGeneratorExcel reportGeneratorExcel = new SalesReportGeneratorExcel();
		byte [] dataAsExcelBytes = reportGeneratorExcel.generateReport(reportData);
		reportGeneratorExcel.saveReportAsBinary(dataAsExcelBytes);		
		
	}
	
	public List<SalesReport> retrieveReportData(){
		System.out.println("fetched from DB...");
		return new ArrayList<>();
	}
}

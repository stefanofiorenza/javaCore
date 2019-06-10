package course.jse.basic.oop.lab.reports.solution;

import java.util.ArrayList;
import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public class ReportJob {

	
	public void executeJob(){
		
		List<SalesReport> reportData = retrieveReportData();
		
		List<SalesReportGenerator> generators = createGenerators ();
		
		for (SalesReportGenerator generator : generators){					
			byte [] dataAsCsvBytes = generator.generateReport(reportData);
			generator.saveReportAsBinary(dataAsCsvBytes);
		}
		
	}
	
	public List<SalesReport> retrieveReportData(){
		System.out.println("fetched from DB...");
		return new ArrayList<>();
	}
	
	
	// usually implemented in some Factory Class populated by config
	private List<SalesReportGenerator> createGenerators (){
		List<SalesReportGenerator> generators = new ArrayList<>();
		generators.add(new SalesReportGeneratorCsvImpl());
		generators.add(new SalesReportGeneratorPdfImpl());
		generators.add(new SalesReportGeneratorExcelImpl());
		return generators;
	}
}

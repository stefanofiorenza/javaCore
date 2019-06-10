package course.jse.basic.oop.lab.reports.solution;

import java.util.List;

import course.jse.basic.oop.lab.reports.domain.SalesReport;

public class SalesReportGeneratorExcelImpl extends  SalesReportGenerator{

	
	@Override
	public byte[] generateReport(List<SalesReport> data){
		System.out.println("calculate report data and generate a binary version .EXCEL");
		return new byte[]{};
	}
	
	
}

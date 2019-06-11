package course.jse.common.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Product {

	private String itemCode;
	private String productName;
	private String manufacturer;
	private BigDecimal unitPrice;
	
}

package course.jse.common.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Order {

	@Getter
	@Setter
	private User user;
	
	@Getter
	private List<Product> products= new ArrayList<>();
}

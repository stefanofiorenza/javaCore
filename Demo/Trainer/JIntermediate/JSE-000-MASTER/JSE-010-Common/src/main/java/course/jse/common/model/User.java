package course.jse.common.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class User {

	@Getter
	@Setter
	private String username;
	
	@Getter
	@Setter
	private String fullName;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter	
	private String telephone;
	
	@Getter
	private List<Order> orders= new ArrayList<>();
	
	
}

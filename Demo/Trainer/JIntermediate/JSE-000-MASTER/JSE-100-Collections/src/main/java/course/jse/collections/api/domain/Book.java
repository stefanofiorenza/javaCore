package course.jse.collections.api.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Book {

	private String title;
	private String author;
	private String isbnCode;
	private double price;
	private Date publishedOn;
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbnCode == null) {
			if (other.isbnCode != null)
				return false;
		} else if (!isbnCode.equals(other.isbnCode))
			return false;
		return true;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbnCode == null) ? 0 : isbnCode.hashCode());
		return result;
	}
}

package course.jse.common.model;

import lombok.Getter;

public class Date {
   
	@Getter
	private int day;  
	@Getter
	private int month;    
	@Getter
	private int year;  
    
    public Date (int newDay, int month, int year) {       
      setDay(newDay);
      setMonth(month);
      setYear(year);
    }

	public int getDay() {
		return day;
	}

	public void setDay(int newDay) {
		if (newDay < 1 ) throw new IllegalStateException("Day cant be smaller than 1");
        if (newDay > 31 ) throw new IllegalStateException("Day cant be higher than 31");
		this.day = newDay;
	}


	public void setMonth(int month) {
		if (month < 1 ) throw new IllegalStateException("Month cant be smaller than 1");
        if (month > 12 ) throw new IllegalStateException("Month cant be higher than 12");
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public int compareDate(Date anotherDate) {
	int res=0;
		
		if (this.getYear()>anotherDate.getYear()){
			res=-1;
			
		}else if (this.getYear()<anotherDate.getYear()){
			res=1;
			
		}else if(this.getMonth()>anotherDate.getMonth()){
			res=-1;
			
		}else if(this.getMonth()<anotherDate.getMonth()){
			res=1;
			
		}else if(this.getDay()>anotherDate.getDay()){
			res=-1;
			
		}else if(this.getDay()<anotherDate.getDay()){
			res=1;
		}
		
		return res;
	}
    
     public String toString(){
    	return getDay()+"/"+getMonth()+"/"+getYear(); 	 
     }

 	
}
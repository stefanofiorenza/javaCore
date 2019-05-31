package course.jse.basic.oop.domain.erp;

public class Date {
   
	private int day;  
	private int month;    
	private int year;  
    
    public Date (int d, int m, int y) {
       
       if (d < 1 ) d = 1;	
       if (d > 31 ) d = 31;
       if (m < 1 ) m = 1;	
       if (m > 12 ) m = 12;
       
       this.day = d; 
       this.month   = m;
       this.year   = y; 
    
    }

	public int getDay() {
		return day;
	}

	public void setDay(int newDay) {
		if (newDay < 1 ) newDay = 1;	
        if (newDay > 31 ) newDay = 31;
		this.day = newDay;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 ) month = 1;	
        if (month > 31 ) month = 31;
		this.month = month;
	}

	public int getYear() {
		return year;
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
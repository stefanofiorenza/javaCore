package course.jse.basic.exceptions.domain;

import course.jse.basic.exceptions.custom.IllegalDateException;

public class Date {
   
	private int day;  
	private int month;    
	private int year;  
    
    public Date (int d, int m, int y) {       
       setDay(d);
       setMonth(m);
       setYear(y);
    
    }

	public int getDay() {
		return day;
	}

	public void setDay(int newDay) {
		
		
		/*
		if (newDay < 1 ) throw new IllegalDateException("Day cant be lower than 1");	
        if (newDay > 31 ) throw new IllegalDateException("Day cant be higher than 31");	        
        */
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
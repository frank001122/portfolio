//   Name: HO Yu Fei Frank
//   Student ID: 56221159
//   Lab section: T03
package calendar;

public class Month {
	final static String[] DAYS = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
	final static int DAYS_PER_WEEK = 7;
    int days;
    int firstDay;
    
    public Month(int days,int firstDay){
    	this.days = days;
    	this.firstDay = firstDay;
    }

	public void printCalendar() {
		for(int i=0;i<DAYS_PER_WEEK;i++) {
			System.out.printf("%-6s",DAYS[i]);
		}
		System.out.println();
		for(int i=0;i<firstDay;i++) {
			System.out.print("      ");	
		}
		if(Year.the_month==1) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_1[i-1]!= null && Year.holidays_1[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_1[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_1[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==2) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_2[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==3) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_3[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==4) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_4[i-1]!= null && Year.holidays_4[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_4[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_4[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==5) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_5[i-1]!= null && Year.holidays_5[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_5[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_5[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==6) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_6[i-1]!= null && Year.holidays_6[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_6[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_6[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==7) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_7[i-1]!= null && Year.holidays_7[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_7[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_7[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==8) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_8[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==9) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_9[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==10) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_10[i-1]!= null && Year.holidays_10[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_10[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_10[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==11) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_11[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}else if(Year.the_month==12) {
			for(int i=1;i<=days;i++) {
				if(Year.appointment_12[i-1]!= null && Year.holidays_12[i-1]!= null) {
					System.out.printf("%2s"+"+"+"*"+"  ",i);
				}else if(Year.holidays_12[i-1]!= null) {
					System.out.printf("%2s"+"+"+"   ",i);
				}else if(Year.appointment_12[i-1]!= null) {
					System.out.printf("%2s"+"*"+"   ",i);
				}else {
					System.out.printf("%2s"+"    ",i);
				}
				if((i+firstDay)%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}
		
		
	}

}

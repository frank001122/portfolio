//   Name: HO Yu Fei Frank
//   Student ID: 56221159
//   Lab section: T03
package calendar;

public class Year {
	final static int NUM_of_MONTH =12;
	public static int [] DAYS_OF_MONTH = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int [] Firstday_Of_Month = {3, 6, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2};
	public static int the_month;
	public static String [] appointment_1 = new String[31];
	public static String [] holidays_1 = new String[31];
	public static String [] appointment_2 = new String[31];
	public static String [] appointment_3 = new String[31];
	public static String [] appointment_4 = new String[31];
	public static String [] holidays_4 = new String[31];
	public static String [] appointment_5 = new String[31];
	public static String [] holidays_5 = new String[31];
	public static String [] appointment_6 = new String[31];
	public static String [] holidays_6 = new String[31];
	public static String [] appointment_7 = new String[31];
	public static String [] holidays_7 = new String[31];
	public static String [] appointment_8 = new String[31];
	public static String [] appointment_9 = new String[31];
	public static String [] appointment_10 = new String[31];
	public static String [] holidays_10 = new String[31];
	public static String [] appointment_11 = new String[31];
	public static String [] appointment_12 = new String[31];
	public static String [] holidays_12 = new String[31];
	Month[] months;
	
	Year(){
		 months =new Month[NUM_of_MONTH];
		for(int i=0;i<NUM_of_MONTH;i++) {
			months[i] = new Month(DAYS_OF_MONTH[i],Firstday_Of_Month[i]);
		}
		
		
	}
    public static void markCalendar(int a,int b,String appoint) {
		if(a==1) {
			appointment_1[b-1] = appoint;
		}else if(a==2) {
			appointment_2[b-1] = appoint;
		}else if(a==3) {
			appointment_3[b-1] = appoint;
		}else if(a==4) {
			appointment_4[b-1] = appoint;
		}else if(a==5) {
			appointment_5[b-1] = appoint;
		}else if(a==6) {
			appointment_6[b-1] = appoint;
		}else if(a==7) {
			appointment_7[b-1] = appoint;
		}else if(a==8) {
			appointment_8[b-1] = appoint;
		}else if(a==9) {
			appointment_9[b-1] = appoint;
		}else if(a==10) {
			appointment_10[b-1] = appoint;
		}else if(a==11) {
			appointment_11[b-1] = appoint;
		}else if(a==12) {
			appointment_12[b-1] = appoint;
		}
	}
    public static void setHoliday() {
    	holidays_1[0] = "New Year's Day";
    	holidays_1[24]= "Lunar New Year";
    	holidays_1[26]= "Third day of Chinese Lunar New Year";
    	holidays_1[27]= "Fourth day of Chinese Lunar New Year";
    	holidays_4[3] = "Ching Ming Festival";
    	holidays_4[9] = "Good Friday";
    	holidays_4[10]= "Good Friday";
    	holidays_4[12]= "Easter Monday";
    	holidays_4[29]= "Buddha's Birthday";
    	holidays_5[0] = "Labor Day";
    	holidays_6[24]="Tuen Ng Festival";
    	holidays_7[0] ="HK SAR Establishment Day";
    	holidays_10[0]="National Day";
    	holidays_10[1]="Day following Mid-Autumn Festival";
    	holidays_10[25]="Day following Chung Yeung Festival";
    	holidays_12[24]="Christmas Day";
    	holidays_12[25]="Christmas Day";
    
	}



}

//   Name: HO Yu Fei Frank
//   Student ID: 56221159
//   Lab section: T03
package calendar;
import java.util.Scanner;
public class MainMenu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean To_main_menu = true;
		int First_choice = 0;
		int First_choice_1 = 0;
		int First_choice_2 = 0;
		//variable for which month of holidays need to print out 
		int Month_holi;
		//variable for which month of appointment need to print out 
		int Month_app;
		int month_app;
		int date_app;
		String Week_day;
		String Week_app;
		String Day_app;
		int Start_month;
		int Start_date;
		int End_month;
		int End_date;
		String [] week = {"Su","Mo","Tu","We","Th","Fr","Sa"};
		Year year2020 = new Year();
		year2020.setHoliday();
		while(To_main_menu) {
			System.out.println("Main Menu");
			System.out.println("============");
			System.out.println("1) Show calendar");
			System.out.println("2) Mark calendar");
			System.out.println("3) Exit");
			System.out.print(">>");
			First_choice = in.nextInt();
			while(First_choice==1) {
				System.out.println("Show calendar");
				System.out.println("============");
				System.out.println("1) Show month");
				System.out.println("2) Show appointment by date");
				System.out.println("3) Show appointment by month");
				System.out.println("4) Show holidays");
				System.out.println("5) Main menu");
				System.out.print(">>");
				First_choice_1 = in.nextInt();
				if(First_choice_1==5) {
					break;
				}else if(First_choice_1==4) {
					System.out.print("Month:");
					Month_holi = in.nextInt();
					for(int i=0;i<31;i++) {
						int j = i+1;
						if(Month_holi==1) {
							if(Year.holidays_1[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_1[i]);
							}
						}else if(Month_holi==4) {
							if(Year.holidays_4[i]!=null) {
								System.out.println("+ " + j +" "  + Year.holidays_4[i]);
							}
						}else if(Month_holi==5) {
							if(Year.holidays_5[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_5[i]);
							}
						}else if(Month_holi==6) {
							if(Year.holidays_6[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_6[i]);
							}
						}else if(Month_holi==7) {
							if(Year.holidays_7[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_7[i]);
							}
						}else if(Month_holi==10) {
							if(Year.holidays_10[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_10[i]);
							}
						}else if(Month_holi==12) {
							if(Year.holidays_12[i]!=null) {
								System.out.println("+ " + j +" " + Year.holidays_12[i]);
						    }
					    }
					}	
				
				}else if(First_choice_1==3) {
					System.out.print("Month:");
					Month_app = in.nextInt();
					for(int i=0;i<31;i++) {
						int j = i+1;
						if(Month_app==1) {
							if(Year.appointment_1[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_1[i]);
							}
						}else if(Month_app==2) {
							if(Year.appointment_2[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_2[i]);
						    }
					    }else if(Month_app==3) {
							if(Year.appointment_3[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_3[i]);
						    }
					    }else if(Month_app==4) {
							if(Year.appointment_4[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_4[i]);
							}
						}else if(Month_app==5) {
							if(Year.appointment_5[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_5[i]);
							}
						}else if(Month_app==6) {
							if(Year.appointment_6[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_6[i]);
							}
						}else if(Month_app==7) {
							if(Year.appointment_7[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_7[i]);
							}
						}else if(Month_app==8) {
							if(Year.appointment_8[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_8[i]);
						    }
					    }else if(Month_app==9) {
							if(Year.appointment_9[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_9[i]);
						    }
					    }else if(Month_app==10) {
							if(Year.appointment_10[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_10[i]);
							}
						}else if(Month_app==11) {
							if(Year.appointment_11[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_11[i]);
						    }
					    }else if(Month_app==12) {
							if(Year.appointment_12[i]!=null) {
								System.out.println("* " + j +" " + Year.appointment_12[i]);
						    }
					    }
					}
				}else if(First_choice_1==2) {
					System.out.print("Date:");
					month_app = in.nextInt();
					date_app  = in.nextInt();
						if(month_app==1) {
							if(Year.appointment_1[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_1[date_app-1]);
							}
						}else if(month_app==2) {
							if(Year.appointment_2[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_2[date_app-1]);
						    }
					    }else if(month_app==3) {
							if(Year.appointment_3[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_3[date_app-1]);
						    }
					    }else if(month_app==4) {
							if(Year.appointment_4[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_4[date_app-1]);
							}
						}else if(month_app==5) {
							if(Year.appointment_5[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_5[date_app-1]);
							}
						}else if(month_app==6) {
							if(Year.appointment_6[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_6[date_app-1]);
							}
						}else if(month_app==7) {
							if(Year.appointment_7[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_7[date_app-1]);
							}
						}else if(month_app==8) {
							if(Year.appointment_8[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_8[date_app-1]);
						    }
					    }else if(month_app==9) {
							if(Year.appointment_9[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_9[date_app-1]);
						    }
					    }else if(month_app==10) {
							if(Year.appointment_10[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_10[date_app-1]);
							}
						}else if(month_app==11) {
							if(Year.appointment_11[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_11[date_app-1]);
						    }
					    }else if(month_app==12) {
							if(Year.appointment_12[date_app-1]!=null) {
								System.out.println("* " + date_app+" " + Year.appointment_12[date_app-1]);
						    }
					    }
					
				}else if(First_choice_1==1) {
					System.out.print("Month:");
					Year.the_month = in.nextInt();
					year2020.months[Year.the_month-1].printCalendar();
				}
			}
			while(First_choice==2) {
				System.out.println("Mark calendar");
				System.out.println("============");
				System.out.println("1) Make appointment");
				System.out.println("2) Delete appointment");
				System.out.println("3) Make weekly appointment");
				System.out.println("4) Main menu");
				System.out.print(">>");
				First_choice_2 = in.nextInt();
				if(First_choice_2==4) {
					break;
				}else if(First_choice_2==3) {
					System.out.print("Day (Su Mo Tu We Th Fr Sa): ");
					Week_day = in.next();
					System.out.print("Event: ");
					//the waste is to make the following in.nextLine() receive a String, as there is a enter after input Week_day.
					String Waste = in.nextLine();
					Week_app = in.nextLine();
					System.out.print("From: ");
					Start_month = in.nextInt();
					Start_date = in.nextInt();
					System.out.print("To: ");
					End_month = in.nextInt();
					End_date = in.nextInt();
					int week_num=0;
					for(int z =0;z<7;z++) {
						
						int week_1 = week[z].charAt(0); 
			            int week_2 = Week_day.charAt(0);
			            int week_1_1 = week[z].charAt(1); 
			            int week_2_2 = Week_day.charAt(1);
			            int sum = 0;
			            if(week_1 ==week_2) {
			            	if(week_1_1==week_2_2) {
			            		week_num = z;
			            	}
			            }
				}
					int [] all_app_month = new int [End_month-Start_month+1];
					for(int i = Start_month;i<=End_month;i++) {
						if(i==Start_month) {
							for(int j = Start_date;j<= Year.DAYS_OF_MONTH[i-1];j++) {
								if(Start_month==1) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_1[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_1[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_1[j-1] = 	Week_app;	
									    }
									}
								}else if(Start_month==2) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==3) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_3[j-1] = 	Week_app;
									}
								}else if(Start_month==4) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
									    }
									}
								}else if(Start_month==5) {
									if(week_num==5) {
										if((j+6)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else if(week_num==6) {
										if((j+6-1)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else {
										if((j+4-week_num)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==6) {
									if(week_num>0) {
										if((j+7-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}else {
										if((j-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==7) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
									    }
									}
								}else if(Start_month==8) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==9) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==10) {
									if(week_num==4) {
										if((j+6)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else if(week_num>4){
										if((j+10-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else {
										if((j+3-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}
								}else if(Start_month==11) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_11[j-1] = 	Week_app;
									}
								}else if(Start_month==12) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}
								}
							}
							System.out.println("Weekly appointment set sucessfully.");
						}else if(i==End_month) {
							for(int j = 1;j<= End_date;j++) {
								if(i==2) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}
								}else if(i==3) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_3[j-1] = 	Week_app;
									}
								}else if(i==4) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
									    }
									}
								}else if(i==5) {
									if(week_num==5) {
										if((j+6)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else if(week_num==6) {
										if((j+6-1)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else {
										if((j+4-week_num)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}
								}else if(i==6) {
									if(week_num>0) {
										if((j+7-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}else {
										if((j-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}
								}else if(i==7) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
									    }
									}
								}else if(i==8) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}
								}else if(i==9) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}
								}else if(i==10) {
									if(week_num==4) {
										if((j+6)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else if(week_num>4){
										if((j+10-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else {
										if((j+3-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}
								}else if(i==11) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_11[j-1] = 	Week_app;
									}
								}else if(i==12) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}
								}
							}
							System.out.println("Weekly appointment set sucessfully.");
						}else {
							for(int j = 1;j<= Year.DAYS_OF_MONTH[i-1];j++) {
								if(i==2) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_2[j-1] = 	Week_app;
										}
									}
								}else if(i==3) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_3[j-1] = 	Week_app;
									}
								}else if(i==4) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_4[j-1] = 	Week_app;	
									    }
									}
								}else if(i==5) {
									if(week_num==5) {
										if((j+6)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else if(week_num==6) {
										if((j+6-1)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}else {
										if((j+4-week_num)%7 == 0) {
											Year.appointment_5[j-1] = 	Week_app;
										}
									}
								}else if(i==6) {
									if(week_num>0) {
										if((j+7-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}else {
										if((j-week_num)%7 == 0) {
											Year.appointment_6[j-1] = 	Week_app;
										}
									}
								}else if(i==7) {
									if(week_num>3) {
										if((j+6-week_num+3)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;
										}
									}else if(week_num==3) {
										if((j+6)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
										}
									}else {
										if((j+2-week_num)%7 == 0) {
											Year.appointment_7[j-1] = 	Week_app;	
									    }
									}
								}else if(i==8) {
									if(week_num==6) {
										if((j+6-week_num)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}else {
										if((j+6-week_num-1)%7 == 0) {
											Year.appointment_8[j-1] = 	Week_app;
										}
									}
								}else if(i==9) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_9[j-1] = 	Week_app;
										}
									}
								}else if(i==10) {
									if(week_num==4) {
										if((j+6)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else if(week_num>4){
										if((j+10-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}else {
										if((j+3-week_num)%7 == 0) {
											Year.appointment_10[j-1] = 	Week_app;
										}
									}
								}else if(i==11) {
									if((j+6-week_num)%7 == 0) {
										Year.appointment_11[j-1] = 	Week_app;
									}
								}else if(i==12) {
									if(week_num==2) {
										if((j+6)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else if(week_num>2) {
										if((j+8-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}else {
										if((j+1-week_num)%7 == 0) {
											Year.appointment_12[j-1] = 	Week_app;
										}
									}
								}
							}
							System.out.println("Weekly appointment set sucessfully.");
						}
						
					}
					
				}else if(First_choice_2==2) {
					System.out.print("Date:");
					month_app = in.nextInt();
					date_app  = in.nextInt();
					Year.markCalendar(month_app,date_app,null);
					System.out.println("Appointment deleted.");
				}else if(First_choice_2==1) {
					System.out.print("Date:");
					month_app = in.nextInt();
					date_app  = in.nextInt();
					System.out.print("Event: ");
					//the waste is to make the following in.nextLine() receive a String, as there is a enter after input two integer.
					String waste = in.nextLine();
					Day_app = in.nextLine();
					Year.markCalendar(month_app,date_app,Day_app);
					System.out.println("Appointment set sucessfully.");
				}
			}
			if(First_choice==3) {
				To_main_menu = false;
			}
		}
		
	}

}

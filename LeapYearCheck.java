import java.util.Scanner;
  public class LeapYearCheck{
	public static void main(String[]args){
	 Scanner scanner = new Scanner(System.in);
	 boolean leapYear = false;
	 while(true){
	 System.out.println("Enter year");
	 int year = scanner.nextInt();
	 if(year % 4 == 0 && year % 400 == 0 && year % 100 == 0){
		leapYear = true;
		System.out.println("Leap Year");
	 }
	 else{leapYear = false;
		System.out.println(" Not a Leap Year");
	 }
	 
	 }
	
	}
}
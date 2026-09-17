import java.util.Scanner;

public class MonthDaysCalculator {
	 public static int daysInMonth(int month, int year) {
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } 
                else {
                    return 28;
                }
            default:
                return -1;
        }
    }
    public static String getMonthName(int month){
        String[] months = {
            "", "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter month and year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        
        int days = daysInMonth(month, year);
        
        if (days == -1) {
            System.out.println(month + " is not a month");
        } else {
            String monthName = getMonthName(month);
            System.out.println(monthName + " " + year + " has " + days + " days.");
        }
        }
        }
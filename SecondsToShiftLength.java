import java.util.Scanner;

public class  SecondsToShiftLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainderAfterHours = totalSeconds % 3600;

        int minutes = remainderAfterHours / 60;
        int seconds = remainderAfterHours % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }
}
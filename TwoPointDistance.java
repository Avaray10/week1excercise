import java.util.Scanner;
public class TwoPointDistance{
	public static double computeDistance(double x1,double x2,double y1,double y2){
		double dx = x2 - x1;
		double dy = y2 - y1;
		double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return distance;
	}
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter x1");
	double x1 = scanner.nextDouble();
	
	System.out.println("Enter x2");
	double x2 = scanner.nextDouble();
	
	System.out.println("Enter y1");
	double y1 = scanner.nextDouble();
	
	System.out.println("Enter y2");
	double y2 = scanner.nextDouble();
	
	double answer = computeDistance(x1, x2, y1, y2);
	if(answer == 0.0){
	System.out.println("Same point");
	}
	System.out.printf("Distance : %.3f\n", answer );
	}

}
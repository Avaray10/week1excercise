import java.util.Scanner;

public class BmiCalculator{
	 public static String bmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } 
        else if (bmi < 25.0) {
            return "Normal";
        } 
        else if (bmi < 30.0) {
            return "Overweight";
        } 
        else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.println("Height (m): ");
        double height = scanner.nextDouble();
        
        if(height <= 0){
            System.out.println("Height must be greater than zero.");
        }
        else{
            double bmi = weight / (height * height);
            
            String category = bmiCategory(bmi);            
            System.out.printf("BMI %.1f — %s%n", bmi, category);
        }
      }   
    }
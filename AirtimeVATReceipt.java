import java.util.Scanner;
public class AirtimeVATReceipt{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Top-up amount");
		double amount = scanner.nextDouble();
		 final double VAT_RATE = 0.075;
		 
		 double vat = amount * VAT_RATE;
		 double total = vat + amount;
		 System.out.printf("TOP-UP Amount %.2f\n:" , amount);
		 System.out.printf("VAT_RATE %.2f\n " , vat);
		 System.out.printf("TOTAL : %.2f\n" , total);
	
	}
	
	}
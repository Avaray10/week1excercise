import java.util.Scanner;
public class DataBundlePicker{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("Enter how many GB you want");
		int gb = scanner.nextInt();
		if(gb <= 0){
		System.out.println("GB cannot be 0");
		}
		if(gb > 0 && gb < 2){
		System.out.println("Take the 2 GB bundle — NGN 1000.");
		}
		if(gb == 2){
		System.out.println("Pay 1000 for 2GB");
		}
		if(gb > 2 && gb < 6){
		System.out.println("Take the 6 GB bundle — NGN 2500.");
		}
		if(gb == 6){
		System.out.println("Pay 2500 for 6GB");
		}
		if(gb > 6 && gb < 15){
		System.out.println("Take the 15 GB bundle — NGN 5000.");
		}
		if(gb == 15){
		System.out.println("Pay 5000 for 15GB");
		}
		if(gb > 15){
		System.out.println("No bundle covers above 15GB");
		}
		
	
	}
	}

}
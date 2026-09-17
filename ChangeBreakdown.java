public class  ChangeBreakdown{
	public static void main(String[]args){
	 int amount = 3750;
	 int thousand = amount / 1000;
	 int remainder = amount % 1000;
	 System.out.println("1000 * " + thousand); 
	 
	 int fiveHundred = remainder / 500;
	 int remainder2 = remainder % 500;
	 System.out.println("500 * " + fiveHundred);
	  
	 int twoHundred = remainder2 / 200;
	 int remainder3 = remainder2 % 200;
	 System.out.println("200 * " + twoHundred);
	 
	 int oneHundred = remainder3 / 100;
	 int remainder4 = remainder3 % 100;
	 System.out.println("100 * " + oneHundred);
	 
	 int fifty = remainder4 / 50;
	 int remainder5 = remainder4 % 50;
	 System.out.println("50 * " + fifty);
	
	}

}
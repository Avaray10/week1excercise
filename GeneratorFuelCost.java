public class  GeneratorFuelCost{
	public static void main(String[] args){
	  double litresPerHour = 1.5;
	  double hoursRun = 6.5 ;
	  double pricePerLitre = 1150.0;
	  
	  double litresRun = litresPerHour * hoursRun;
	  double fuelCost = pricePerLitre * litresRun;
	  
	  System.out.println(litresPerHour);
	  System.out.println(hoursRun);
	  System.out.println("Total fuel cost:" + fuelCost);
	  System.out.println("Total litres Run:" + litresRun);
	
	}

}
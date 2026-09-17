public class DeliveryEligibility {
    public static void main(String[] args) {
        int batteryPercent = 35;
        double distanceKm = 14.0;
        boolean isOnShift = true;
        boolean hasHelmet = true;

		System.out.println("""
			 batteryPercent = 35;
			 distanceKm = 12.0;
			 isOnShift = true;
			 hasHelmet = false;
		""");
        if (!isOnShift){
            System.out.println("Not eligible: Not on shift");
        } 
        else if (!hasHelmet){
            System.out.println("Not eligible: Missing helmet");
        } 
        else if (batteryPercent < 20) {
            System.out.println("Not eligible: Battery too low");
        } 
        else if (distanceKm > 15.0) {
            System.out.println("Not eligible: Distance too long");
        } 
        else {
            System.out.println("Eligible");
        }
    }
}

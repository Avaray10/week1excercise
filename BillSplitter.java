public class BillSplitter {

    public static void main(String[] args) {
        int totalBill = 17550;
        int numberOfPeople = 4;

        int evenShare = totalBill / numberOfPeople;

        int remainder = totalBill % numberOfPeople;

        System.out.println("Each person pays: " + evenShare + " naira");
        System.out.println("Leftover amount (remainder): " + remainder + " naira");
        System.out.println(" one person needs to pay extra " + remainder + "naira to fully settle the bill.");
    }
}

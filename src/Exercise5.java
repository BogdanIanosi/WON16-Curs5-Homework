import java.util.Random;

public class Exercise5 {

    public static void main(String[] args) {
        int targetDonation = 1000;
        int maxDonations = 20;
        int totalDonation = 0;

        donate(targetDonation, maxDonations, totalDonation);
    }

    public static void donate(int target, int maxDonations, int total) {
        Random rand = new Random();
        int donationCount = 0;

        while (total < target && donationCount < maxDonations) {
            int donation = rand.nextInt(100) + 1;
            total += donation;
            donationCount++;
            System.out.println("Donație #" + donationCount + ": " + donation);
        }

        if (total >= target) {
            System.out.println("Suma dorita de donatii a fost atinsă! Suma totala: " + total);
        } else {
            System.out.println("Suma dorita de donatii nu a fost atinsă. Suma totala: " + total);
        }
    }
}

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        int targetDonation = 1000; // Suma dorită pentru donații
        donationSimulation(targetDonation);
    }

    public static void donationSimulation(int targetDonation) {
        Random rand = new Random();
        int totalDonation = 0;

        while (totalDonation < targetDonation) {
            int donationAmount = rand.nextInt(100);
            totalDonation += donationAmount;
            System.out.println("A fost primită o donație de " + donationAmount + " lei. Total donat: " + totalDonation + " lei.");


            try {
                Thread.sleep(650);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Suma dorită de donații de " + targetDonation + " lei a fost atinsă! Mulțumim pentru susținere!");
    }
}


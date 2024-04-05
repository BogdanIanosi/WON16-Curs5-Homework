import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static List<Integer> numereMaiMariDecat(int[] sirNumere, int numar) {
        List<Integer> rezultat = new ArrayList<>();

        for (int i = 0; i < sirNumere.length; i++) {
            if (sirNumere[i] > numar) {
                rezultat.add(sirNumere[i]);
            }
        }

        return rezultat;
    }

    public static void main(String[] args) {
        int[] sirNumere = {1, 5, 10, 15, 20};
        int numar = 10;

        List<Integer> rezultat = numereMaiMariDecat(sirNumere, numar);

        System.out.println("Numerele mai mari decat " + numar + " sunt: " + rezultat);
    }
}

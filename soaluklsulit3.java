import java.util.HashMap;
import java.util.Scanner;
            
public class soaluklsulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        for (int elemen : array) {
            frekuensi.put(elemen, frekuensi.getOrDefault(elemen, 0) + 1);
        }

        System.out.println("\nFrekuensi elemen dalam array:");
        for (int elemen : frekuensi.keySet()) {
            System.out.println(elemen + " muncul " + frekuensi.get(elemen) + " kali");
        }
    }
}

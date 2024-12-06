import java.util.Scanner;

public class soaluklsedang2 {
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung (dalam satuan cm): ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (dalam satuan cm): ");
        double tinggi = scanner.nextDouble();

        double volume = hitungVolumeTabung(jariJari, tinggi);

        System.out.printf("Volume tabung adalah %.2f meter kubik.%n", volume);
    }
}

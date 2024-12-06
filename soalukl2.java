import java.util.Scanner;

public class soalukl2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai awal");
        int nilaiawal = scanner.nextInt();

        System.out.println("Masukkan nilai akhir");
        int nilaiakhir = scanner.nextInt();

        for (int i = nilaiawal; i >= nilaiakhir; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " Hasil nya ganjil");
            } else {
                System.out.println(i + " Hasil nya genap");
            }
        }
    }
}

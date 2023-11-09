import java.util.Scanner;

public class SegitigaBintang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = scanner.nextInt();

        if (N < 5) {
            System.out.println("Input tidak valid. N minimal harus 5.");
        } else {
            for (int i = N; i >= 1; i--) {
               
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

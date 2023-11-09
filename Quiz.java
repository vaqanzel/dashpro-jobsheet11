import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random(); 
        Scanner input = new Scanner(System.in);
        char menu = 'y'; 
        
        do {
            int number = random.nextInt(10) + 1; 
            boolean success = false;
            
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt(); 
                input.nextLine();
                
                if (answer < number) {
                    System.out.println("Tebakan terlalu kecil. Coba lagi!");
                } else if (answer > number) {
                    System.out.println("Tebakan terlalu besar. Coba lagi!");
                } else {
                    success = true;
                    System.out.println("Selamat! Tebakan Anda benar.");
                }
                
            } while (!success);
            
            System.out.print("Apakah Anda ingin mengulang permainan? (Y/y, T/t): "); 
            menu = input.nextLine().charAt(0);
            
            while (menu != 'y' && menu != 'Y' && menu != 't' && menu != 'T') {
                System.out.println("Pilihan tidak valid. Silakan masukkan Y/y atau T/t.");
                System.out.print("Apakah Anda ingin mengulang permainan? (Y/y, T/t): ");
                menu = input.nextLine().charAt(0);
            }

        } while (menu == 'y' || menu == 'Y');
        
        if (menu == 't' || menu == 'T') {
            System.out.println("Terima kasih telah bermain!");
        }
    }
}

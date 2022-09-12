import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner inpt = new Scanner(System.in);

        System.out.print("Masukkan Tahun yang ingin dicek : ");
        tahun = inpt.nextInt();

        if (tahun % 4 == 0 || tahun % 400 == 0 || tahun % 100 == 0) {
            System.out.println("Tahun ini adalah tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}

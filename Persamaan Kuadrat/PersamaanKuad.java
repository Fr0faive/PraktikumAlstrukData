import java.util.Scanner;

public class PersamaanKuad {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;

        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan angka untuk nilai A, B, C :");
        a = angka.nextInt();
        b = angka.nextInt();
        c = angka.nextInt();

        d = b * b - 4 * a * c;
        System.out.println("Nilai D : " + d);

        if (d < 0) {
            System.out.println("Akar Imajiner");
            System.out.println("Nilai D : " + d);
        } else if (d == 0) {
            d = -b / (2 * a);
            x1 = d;
            x2 = x1;
            System.out.println("X1 = X2");
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);
            System.out.println("Nilai D : " + d);
        } else if (d > 0) {
            x1 = -b + Math.sqrt(d / 2 * a);
            x2 = -b - Math.sqrt(d / 2 * a);
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);
            System.out.println("Nilai D : " + d);
        }
    }
}

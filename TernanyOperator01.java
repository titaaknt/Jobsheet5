import java.util.Scanner;
public class TernanyOperator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap " : " Angka " + angka + " termasuk bilangan ganjil ";

        System.out.println(hasil);
    }
}
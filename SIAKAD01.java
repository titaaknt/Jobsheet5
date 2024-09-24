import java.util.Scanner;

public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data nilai
        System.out.print("Masukkan nilai tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan nilai ujian: ");
        double ujian = scanner.nextDouble();

        double nilaiAkhir = (tugas * 0.4) + (ujian * 0.6);


        String nilaiHuruf;
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

    }
}

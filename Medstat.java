import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Diberikan data tinggi siswa SMA Kartika sebagai berikut:");
        
        // Akan dibuat data dengan menggunakan perintah Math.random
        int d1 = 160 + (int)(Math.random()*21);
        int d2 = 160 + (int)(Math.random()*21);
        int d3 = 160 + (int)(Math.random()*21);
        int d4 = 160 + (int)(Math.random()*21);
        int d5 = 160 + (int)(Math.random()*21);
        int d6 = 160 + (int)(Math.random()*21);
        int d7 = 160 + (int)(Math.random()*21);
        int d8 = 160 + (int)(Math.random()*21);
        int d9 = 160 + (int)(Math.random()*21);
        int d10 = 160 + (int)(Math.random()*21);
        
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
        System.out.println(d6 + " " + d7 + " " + d8 + " " + d9 + " " + d10);
        System.out.println("Hitunglah Mean, Ragam dan Simpangan Baku dari data tersebut.");
        System.out.println("Selamat mengerjakan!");
        
        // Hitung Rata-rata
        double sum = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10;
        double mean = (sum/10);
        
        // Hitung Ragam
        double ragamRaw = (Math.pow(d1-mean, 2) + Math.pow(d2-mean, 2)
                        + Math.pow(d3-mean, 2) + Math.pow(d4-mean, 2)
                        + Math.pow(d5-mean, 2) + Math.pow(d6-mean, 2)
                        + Math.pow(d7-mean, 2) + Math.pow(d8-mean, 2)
                        + Math.pow(d9-mean, 2) + Math.pow(d10-mean, 2));
        // Pembulatan 2 angka di belakang koma
        double ragamRounded = (Math.round(ragamRaw * 100.0) / 100.0);
        double ragam = ragamRounded / 10;
        
        // Hitung Simpangan Baku
        double sBRaw = Math.sqrt(ragam);
        // Pembulatan 2 angka di belakang koma
        double sB = (Math.round(sBRaw * 100.0) / 100.0);
        
        // Akan diinput jawaban pengguna
        System.out.println("Masukan Nilai Mean: ");
        double meanAnw = input.nextDouble();
        
        System.out.println("Masukan Nilai Ragam: ");
        double ragamAnw = input.nextDouble();
        
        System.out.println("Masukan Nilai Simpangan Baku: ");
        double sBAnw = input.nextDouble();
        
        // Dicek jawaban pengguna dengan hasil sebenarnya
        if (mean == meanAnw && ragam == ragamAnw && sB == sBAnw) {
            System.out.println("Jawaban Kamu Benar!");
        } else if (mean == meanAnw && ragam == ragamAnw && sB != sBAnw) {
            System.out.println("Nilai Mean dan Ragam Sudah Benar, "
                    + "Namun Simpangan Bakunya Masih Salah.");
        } else if (mean == meanAnw && ragam != ragamAnw && sB == sBAnw) {
            System.out.println("Nilai Mean dan Simpangan Baku Sudah Benar, "
                    + "Namun Ragamnya Masih Salah.");
        } else if (mean != meanAnw && ragam == ragamAnw && sB == sBAnw) {
            System.out.println("Nilai Ragam dan Simpangan Baku Sudah Benar, "
                    + "Namun Meannya Masih Salah.");
        } else if (mean == meanAnw && ragam != ragamAnw && sB != sBAnw) {
            System.out.println("Nilai Mean Sudah Benar, "
                    + "Namun Ragam dan Simpangan Bakunya Masih Salah.");
        } else if (mean != meanAnw && ragam == ragamAnw && sB != sBAnw) {
            System.out.println("Nilai Ragam Sudah Benar, "
                    + "Namun Mean dan Simpangan Bakunya Masih Salah.");
        } else if (mean != meanAnw && ragam != ragamAnw && sB != sBAnw) {
            System.out.println("Nilai Simpangan Baku Sudah Benar, "
                    + "Namun Mean dan Ragamnya Masih Salah.");
        } else {
            System.out.println("Jawaban Kamu Salah!");
        }
            
        // Tampilkan jawaban sebenarnya
        System.out.println("Nilai Mean " + mean + " dengan Ragam " + ragam +
                " dan Simpangan Baku " + sB);
        
        input.close();
    }
}

public class Sedang2 {
    public static void main(String[] args) {
        


java.util.Scanner Tabung = new java.util.Scanner(System.in);

System.out.print("Masukkan jari-jari alas tabung: ");
double jari_jari = Tabung.nextDouble();

System.out.print("Masukkan tinggi tabung: ");
double tinggi = Tabung.nextDouble();

double volume = hitungVolumeTabung(jari_jari, tinggi);
System.out.printf("Volume tabung adalah: %.2f satuan kubik%n", volume); 
}

    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

}

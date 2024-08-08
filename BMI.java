import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double BMI, beratBadan, tinggibadan;

        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung BMI");
        System.out.println("Masukkan Berat Badan");
        beratBadan = input.nextDouble();
        System.out.println("Masukkan Tinggi Badan");
        tinggibadan = input.nextDouble();

        BMI=beratBadan/(tinggibadan*tinggibadan);
        System.out.println("BMInya adalah "+BMI);
    }
}
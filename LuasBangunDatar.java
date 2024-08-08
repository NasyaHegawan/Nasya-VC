import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        int panjang, lebar, luas;

        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Masukkan panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar");
        lebar = input.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah:"+luas );
    }
}
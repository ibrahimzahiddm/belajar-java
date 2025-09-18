import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("harga barang ");
        System.out.println("----------------");
        System.out.println("novel = 100.000");
        System.out.println("komik = 35.000");
        System.out.println("madilok = 130.000");
        System.out.println("kitab = 200.000");
        System.out.println("----------------------");

        System.out.println("jumlah barang = ");
        int jumlah = input.nextInt();
        int total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("masukan harga barang " + i + " =");
            int harga = input.nextInt();

            System.out.println("masukan jumlah barang " + i + " =");
            int barang = input.nextInt();
            total += harga * barang;
        }
        System.out.println("total belanja = " + total);

        System.out.println("jumlah uang");
        int bayar = input.nextInt();

        if (bayar >= total){
            int kembali = bayar - total;;
        System.out.println("kembalian = " + kembali);
        }else {
            System.out.println("uang tidak cukup");
        }
        System.out.println("terima kasih telah berbelanja");




    }
}
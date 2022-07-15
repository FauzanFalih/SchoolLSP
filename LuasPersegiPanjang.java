import java.util.Scanner;

public class LuasPersegiPanjang{
    

    public static void main (String[]args){

    int p;
    int l;
    int L;

    Scanner keyboard = new Scanner (System.in);
    //new kata ganti class Scanner

    System.out.println("Program Hitung Luas ");

    //User melakukan input data panjang
    /* 
    Nama Programmer : ....
    Alamat : .....
    */

    System.out.print("Masukkan Panjang :");

    p = Integer.parseInt(keyboard.nextLine());
   // p = keyboard.nextLine();

    System.out.print("Masukkan Lebar : ");

    l = Integer.parseInt(keyboard.nextLine());
    //l = keyboard.nextLine();

    L=p*l; // Rumus Luas Persegi Panjang

    keyboard.close();

    System.out.println("Panjang adalah : "+p);
    System.out.println("Lebar adalah : "+l);
    System.out.println("Luas adalah : "+L);

    }
}
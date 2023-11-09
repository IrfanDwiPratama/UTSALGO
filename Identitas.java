import java.util.Scanner;

public class perkenalandiri {
    public static void main(String[]args) {
        String nama;
        int umur;
        float tinggi;
        //untuk memasukan nama
        try (Scanner scanner = new Scanner(System.in)){
            
            //untuk memasukan nama
            System.out.print("masukan nama:");
            nama = scanner.nextLine();
            
            //untuk memasukan tinggi badan
            System.out.print("Masukan umur: ");
            umur = scanner.nextInt();
            
            // untuk memasukan umur
            System.out.print("masukan tinggi badan (dalam CM):");
            tinggi = scanner.nextFloat();
        }
        
        // untuk output nya
        System.out.println ("halo nama saya:" + nama );
        System.out.println ("tinggi saya" + tinggi + "CM" );
        System.out.println ("umur saya" + umur );
    }   
}

import java.util.Scanner;

public class konversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println();
            System.out.println("Menu :");
            System.out.println("0. KELUAR");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.print("   Masukkan pilihan anda : ");
            int pilihan = input.nextInt();
            System.out.println();
        
            switch (pilihan) {
                case 0:
                    System.out.println("Keluar Dari Program");
                    start = false;
                    break;
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = input.next();
                    int desimal = Integer.parseInt(biner, 2);
                    System.out.println("Hasil konversi: " + desimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalInput = input.nextInt();
                    String binerOutput = Integer.toBinaryString(desimalInput);
                    System.out.println("Hasil konversi: " + binerOutput);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerInput = input.next();
                    int desimalOutput = Integer.parseInt(binerInput, 2);
                    String heksadesimalOutput = Integer.toHexString(desimalOutput);
                    System.out.println("Hasil konversi: " + heksadesimalOutput);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalInput = input.next();
                    int desimalFromHex = Integer.parseInt(heksadesimalInput, 16);
                    String binerFromHex = Integer.toBinaryString(desimalFromHex);
                    System.out.println("Hasil konversi: " + binerFromHex);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToHex = input.nextInt();
                    String heksadesimalOutput2 = Integer.toHexString(desimalToHex);
                    System.out.println("Hasil konversi: " + heksadesimalOutput2);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalInput2 = input.next();
                    int desimalFromHex2 = Integer.parseInt(heksadesimalInput2, 16);
                    System.out.println("Hasil konversi: " + desimalFromHex2);
                    break;
                default:
                    System.out.println("Masukkan Angka 0-6");
                    System.out.println();
            }
        }
    input.close();
    }
}

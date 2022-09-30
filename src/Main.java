import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int temp = 0;
        System.out.println("masukan jumlah array yang diinginkan");
        int [] arai = new int[read.nextInt()];
        String [] nambar = new String[arai.length];

        for (int i = 0; i < arai.length ; i++) {
            System.out.print("masukan nama barang : ");
            nambar[i]= read.next();
            System.out.print("masukan harga barang : ");
            arai[i]= read.nextInt();
        }

        for (int i = 0; i < arai.length; i++) {
            for (int j = i+1; j < arai.length; j++) {
                if(arai[i] < arai[j]) {
                    temp = arai[i];
                    arai[i] = arai[j];
                    arai[j] = temp;
                }
            }
        }
        System.out.println("harga barang dari yang terbesar : ");
        for (int i = 0; i < arai.length; i++) {
            System.out.println(arai[i] + " ");
        }
    }
}


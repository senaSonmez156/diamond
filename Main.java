package elmas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamak say�s�n� giriniz: ");
		int n =scan.nextInt();
		
		
		
		
		for (int i = 1 ; i <= n ; i++){ //Sat�rsay�s�


            for (int b = 1 ; b<=(n-i);b++) { //bo�luk say�s�
                System.out.print(" ");
            }

                for (int j = 1 ; j<=(2*i)-1 ; j++){ //bo�luktan sonra sat�rda kullan�lacak y�ld�z say�s�
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int l = n-1 ; l >= 1 ; l--) { //Sat�rsay�s�

            for (int h = 1; h <= (n-l) ; h++) { //bo�luk say�s�
                System.out.print(" ");
            }
                for (int g = (2*l)-1; g>=1; g--) { //bo�luktan sonra sat�rda kullan�lacak y�ld�z say�s�
                    System.out.print("*");




        }

            System.out.println();



        }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
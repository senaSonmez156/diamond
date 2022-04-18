package elmas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamak sayýsýný giriniz: ");
		int n =scan.nextInt();
		
		
		
		
		for (int i = 1 ; i <= n ; i++){ //Satýrsayýsý


            for (int b = 1 ; b<=(n-i);b++) { //boþluk sayýsý
                System.out.print(" ");
            }

                for (int j = 1 ; j<=(2*i)-1 ; j++){ //boþluktan sonra satýrda kullanýlacak yýldýz sayýsý
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int l = n-1 ; l >= 1 ; l--) { //Satýrsayýsý

            for (int h = 1; h <= (n-l) ; h++) { //boþluk sayýsý
                System.out.print(" ");
            }
                for (int g = (2*l)-1; g>=1; g--) { //boþluktan sonra satýrda kullanýlacak yýldýz sayýsý
                    System.out.print("*");




        }

            System.out.println();



        }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
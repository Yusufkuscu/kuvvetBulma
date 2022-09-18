import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        int num = scan.nextInt();

        System.out.print("4'ün kuvveti olan sayılar : ");
        for(int i = 1; i<=num; i*=4){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.print("5'in kuvveti olan sayılar : ");
        for(int i = 1; i<=num; i*=5){
            System.out.print(i + " ");
        }
    }
}

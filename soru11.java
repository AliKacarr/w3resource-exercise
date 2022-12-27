import java.util.Scanner;

public class soru11 {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	System.out.print("sayı1=");
	int sayı1=giris.nextInt();
	System.out.print("sayı2=");
	int sayı2=giris.nextInt();
System.out.print("sayı3=");
	int sayı3=giris.nextInt();
	System.out.println("avarage="+(sayı1+sayı2+sayı3)/3);
}
}


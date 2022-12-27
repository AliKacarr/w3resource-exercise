import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	System.out.print("sayı=");
	int a=giris.nextInt();
    for(int i=1;i<11;i++)
	System.out.printf("%d*%d=%d\n",a,i,a*i);
    
	
	
	}

}

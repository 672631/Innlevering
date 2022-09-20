package no.hvl.dat100;
import java.util.Scanner;
public class Fakultet {

	public static void main(String[] args) {
		// 
Scanner input=new Scanner(System.in);
int n=input.nextInt();

int resultat=1;
for (int i=1; i<=n; i++) {

resultat*=i;
System.out.println(resultat);

}

	}

}

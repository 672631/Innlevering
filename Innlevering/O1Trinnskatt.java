package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
public class O1Trinnskatt{

	public static void main(String[] args) {

		String inntektBrutto=showInputDialog("Bruttoinntekt: ");
		double a= parseDouble(inntektBrutto);

		if (a <= 190349) {
			a=(a*0);


		}

		else if(a >= 190350 && a <= 267899) {
			a=(a * 0.017*100)/100.0;
		}

		else if (a >= 267900 && a <= 643799) {
			a=Math.round(a * 0.04 * 100)/100.0;
		}

		else if (a >= 643800 && a <= 969199) {
			a=(a * 0.134 * 100)/100.0;
		}
		else if (a >= 969200 && a <= 1999999) {
			a=(a * 0.164 * 100)/100.0;
		}
		else if (a >= 2000000) {
			a=Math.round(a * 0.174 * 100)/100.0;
		}
		showMessageDialog(null,"Din skatt er: "+a +"kr");
	}
}





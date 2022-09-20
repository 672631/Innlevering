package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O2KarakterBeregning {

	public static void main(String[] args) {
		// 
		int i=1;
		int p; //p for poeng

		for(int j=1; j<=10; j++) {
			String poengSum=showInputDialog("Poengsum: " +i++);
			p=parseInt(poengSum);
			if (p<=100 && p>=0) {

			

			if (p>=90) {
				showMessageDialog(null, "A");
			} else if (p>=80) {
				showMessageDialog(null, "B");
			} else if (p>=60) {
				showMessageDialog(null, "C");;
			} else if (p>=50) {
				showMessageDialog(null, "D");
			} else if (p>=40) {
				showMessageDialog(null, "E");
			} else {
				showMessageDialog(null, "F");
			}  
		}else if(p<0 || p>100){
			showMessageDialog(null, "Ugyldig poengsum.");
			p=parseInt(poengSum);
			j--;
			i--;

		}
	}
}
}

















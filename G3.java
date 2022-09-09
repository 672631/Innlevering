package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class G3 {

	public static void main(String[] args) {

		int tall1= parseInt (showInputDialog("tall 1: "));
		int tall2= parseInt (showInputDialog("tall 2 :"));

		if (tall2>0){
			showMessageDialog(null, tall1/tall2);
		}
		else {
			showMessageDialog(null, "Kan ikke dele med 0!");
		}


	}

}

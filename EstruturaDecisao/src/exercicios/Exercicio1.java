package exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// declarar variaveis
		int num1, num2, dif = 0;
		
		//entradas
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? "));
	
		//condi��es
		if (num1 > num2) {
			dif = num1 - num2;
			
		}
		
		if (num1 < num2) {
			dif = num2 - num1;
		}
		
		JOptionPane.showMessageDialog(null, "Diferen�a = " + dif);
		
		
}
}

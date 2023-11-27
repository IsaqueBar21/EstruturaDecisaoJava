package exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		//declarar variaveis
		int N;
		
		//entradas
		N = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inserido? "));
		
		//condição
		if (N < 0) {
			N = N*(-1);
		}
		
		//saida
		JOptionPane.showMessageDialog(null, "O número é : " + N);

}
}
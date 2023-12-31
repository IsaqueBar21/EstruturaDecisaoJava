package testes;

import javax.swing.JOptionPane;

import classes.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		//declaração das variaveis
		String nome;
		float nota1, nota2;
		
		//entradas
		nome = JOptionPane.showInputDialog("Entre com o nome do aluno: ");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota: "));
	
		//objeto da classe
		Aluno aluno = new Aluno(nome, nota1, nota2);
		
		//processamento
		aluno.calcularMedia();
		aluno.verificarStatusAluno();
		
		//saida
		JOptionPane.showMessageDialog(null, aluno.mostrarDados());
	}

}

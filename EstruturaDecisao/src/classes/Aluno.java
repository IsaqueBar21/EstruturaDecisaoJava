package classes;

public class Aluno {
	//atributos
	public String nome;
	public float nota1;
	public float nota2;
	public float media;
	public String statusAluno;
	
	//construtor
	public Aluno(String nome, float nota1, float nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	//metodos
	public String mostrarDados() {
		return "Nome: " + this.nome
				+ "\n 1� nota: " + this.nota1 
				+"\n 2� nota: " + this.nota2
				+"\n M�dia: " + this.media
				+"\n Aluno: " + this.statusAluno;	
		
	}
	
	public void calcularMedia() {
		this.media = (this.nota1 + this.nota2)/2;
	}
	
	public void verificarStatusAluno() {
		if (this.media > 6) {
			this.statusAluno = "Aprovado";
			System.out.println(this.statusAluno);
		}
		if (this.media <= 5.9) {
			this.statusAluno = "Reprovado";
			System.out.println(this.statusAluno);
		}
	}

}

package cursoEmJava.treinamento;

public class Treinamento1Media {
	public static void main(String[] args) {
		
		double nota1 = 10;
		double nota2 = 10;
		double nota3 = 10;
		double nota4 = 10;
		double mediaTotal = 0;
		String nomeAluno = "Rafael Morales";
		mediaTotal = (nota1 + nota2 + nota3 + nota4 )/4;
		
		System.out.println("Aluno primeira nota : " +nota1);
		System.out.println("Aluno segunda nota : " +nota2);
		System.out.println("Aluno terceira nota : " +nota3);
		System.out.println("Aluno quarta nota : " +nota4 );
		
		if(mediaTotal >= 7) {
			System.out.println("Parab�ns");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ " voc� esta aprovado");
			
		}else if(mediaTotal >=6) {
			System.out.println("�timo");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ "voc� esta de exame");
			
		}else {
			System.out.println("Deu ruim");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ "voc� esta reprovado ");
		}
		
	}

}

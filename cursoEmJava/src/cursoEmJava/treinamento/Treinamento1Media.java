package cursoEmJava.treinamento;

public class Treinamento1Media {
	public static void main(String[] args) {
		//testando 
		double nota1 = 5;
		double nota2 = 6;
		double nota3 = 6;
		double nota4 = 6;
		double mediaTotal = 0;
		String nomeAluno = "Rafael Morales";
		mediaTotal = (nota1 + nota2 + nota3 + nota4 )/4;
		
		System.out.println("Aluno primeira nota : " +nota1);
		System.out.println("Aluno segunda nota : " +nota2);
		System.out.println("Aluno terceira nota : " +nota3);
		System.out.println("Aluno quarta nota : " +nota4 );
		
		if(mediaTotal >= 7 && nomeAluno.equals("Rafael Morales")) {
			System.out.println("Parab�ns");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ " voc� esta aprovado");
			
		}else if(mediaTotal >=6 && nomeAluno.equals("Rafael Morales")) {
			System.out.println("�timo");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ " voc� esta de exame");
			
		}else {
			System.out.println("Deu ruim");
			System.out.println(nomeAluno+ " sua m�dia � : " +mediaTotal+ " voc� esta reprovado ");
		}
		
	}

}

package cursoEmJava.treinamento;

public class WhileSalarioBonificacao {

	public static void main(String[] args) {
		
		String nome = "Rafael Morales de Lima";
		int anosTrabalhado = 6;
		double salarioAtual = 3000;
		double bonusSalarial = 2000;
		double novoSalario = 0;
	
		System.out.println("Programa Bonifica��o salarial Programador Jr.");
		
		while(nome == "Rafael Morales de Lima" && anosTrabalhado >= 6) {
			
			novoSalario = salarioAtual + bonusSalarial;
			System.out.println("Ol� Programado Jr. " +nome+ " Parab�ns! tempo de servi�o � : " +anosTrabalhado);
			System.out.println("Seu salario normal � : "+salarioAtual+ ""
					+ " agora seu novo sal�rio � :" +novoSalario);
					
			break;
		}
		
		while (nome == "Rafael Morales de Lima" && anosTrabalhado < 6) {
			System.out.println("Ol� Programado Jr. " +nome+ " tem que trabalhar mais para ganhar mais.");
			System.out.println("Seu salario normal � : "+salarioAtual);
			System.out.println("Tempo de servi�o � : "+anosTrabalhado);
			break;
		}
		
		
	}
}

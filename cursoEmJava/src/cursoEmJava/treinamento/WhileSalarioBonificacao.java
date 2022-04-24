package cursoEmJava.treinamento;

public class WhileSalarioBonificacao {

	public static void main(String[] args) {
		
		String nome = "Rafael Morales de Lima";
		int anosTrabalhado = 6;
		double salarioAtual = 3000;
		double bonusSalarial = 2000;
		double novoSalario = 0;
	
		System.out.println("Programa Bonificação salarial Programador Jr.");
		
		while(nome == "Rafael Morales de Lima" && anosTrabalhado >= 6) {
			
			novoSalario = salarioAtual + bonusSalarial;
			System.out.println("Olá Programado Jr. " +nome+ " Parabéns! tempo de serviço é : " +anosTrabalhado);
			System.out.println("Seu salario normal é : "+salarioAtual+ ""
					+ " agora seu novo salário é :" +novoSalario);
					
			break;
		}
		
		while (nome == "Rafael Morales de Lima" && anosTrabalhado < 6) {
			System.out.println("Olá Programado Jr. " +nome+ " tem que trabalhar mais para ganhar mais.");
			System.out.println("Seu salario normal é : "+salarioAtual);
			System.out.println("Tempo de serviço é : "+anosTrabalhado);
			break;
		}
		
		
	}
}

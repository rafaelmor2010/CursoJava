package cursoEmJava.treinamento;
import java.util.*;

public class OperacoesIfMediaObjetoScanner {
	public static void main(String[] args) {
		
		Scanner nota1 = new Scanner(System.in);
		Scanner nota2 = new Scanner(System.in);
		Scanner nota3 = new Scanner(System.in);
		Scanner nota4 = new Scanner(System.in);
		Scanner nomeAluno = new Scanner(System.in);
		double mediaTotal = 0;
		
		
		
		System.out.println("Digite o nome do aluno : ");
		String nome = nomeAluno.next();
		
		System.out.println("Digite a Nota 1 : ");
		double nota01 = nota1.nextDouble();
		
		System.out.println("Digite a Nota 2 : ");
		double nota02 = nota2.nextDouble();
		
		System.out.println("Digite a Nota 3 : ");
		double nota03 = nota3.nextDouble();
		
		System.out.println("Digite a Nota 4 : ");
		double nota04 = nota4.nextDouble();
		
		mediaTotal = (nota01 + nota02 + nota03 + nota04)/4;
		
		if (mediaTotal >= 4 & mediaTotal <= 6 ) {
			System.out.println("Aluno "+nome);
			System.out.println("Aluno esta em Exame: "+mediaTotal);
		}
			
		else if (mediaTotal >= 7 & mediaTotal <= 9) {
				System.out.println("Aluno "+nome);
				System.out.println("Aluno esta aprovado Ótima nota:" +mediaTotal);
			}else if (mediaTotal == 10) {
				System.out.println("Aluno "+nome);
				System.out.println("Aluno esta Apovado e tirou nota máxima Parabéns: "+mediaTotal);
				
			}
			
			else {
				System.out.println("Aluno "+nome);
				System.out.println("Aluno esta Reprovado: "+mediaTotal);
			}
		
			
			
		}
		
		
		
	}



package cursojava.principal;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class MainPrincipal {
	public static void main(String[] args) {
		//new Aluno() � Uma Instacia do objeto 
		//criando objeto
		//aluno1 � uma vari�vel de  referencia para objeto aluno
		
		/*aluno1.nome="Jo�o";
		System.out.println("Ol� "+aluno1.nome); */
		
		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ? ");
		String idade =  JOptionPane.showInputDialog("Qual idade do Aluno ? ");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento do Aluno ? ");
		String registroGeral = JOptionPane.showInputDialog("Qual RG do ALuno ?");
		String cpf = JOptionPane.showInputDialog("Qual CPF do ALuno ?");
		String nomeMae = JOptionPane.showInputDialog("Qual nome da m�e ?");
		String nomePai = JOptionPane.showInputDialog("Qual nome do Pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual nome da escola ?");
		String SerieMatricula = JOptionPane.showInputDialog("Qual a s�rie matriculada ?");
		
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 ?");
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("\n----------------------------------------------------");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));//convertendo para inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(SerieMatricula);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Ol� "+aluno1.getNome());				
		System.out.println("A idade � : "+aluno1.getIdade());				
		System.out.println("A data Nascimento � : "+aluno1.getDataNascimento());				
		System.out.println("O RG � : "+aluno1.getRegistroGeral());	
		System.out.println("O CPF � :"+aluno1.getNumeroCpf());
		System.out.println("Nome da m�e � :"+aluno1.getNomeMae());				
		System.out.println("Nome do pai � :"+aluno1.getNomePai());			
		System.out.println("A data da matr�cula � :"+aluno1.getDataMatricula());				
		System.out.println("Nome " +aluno1.getNomeEscola());				
		System.out.println("Matriculado " +aluno1.getSerieMatriculado());
	
		System.out.println("Sua m�dia � : "+aluno1.getMedia());
		System.out.println("Resultado foi : " +( aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado" ));
		System.out.println("Resultado 2 foi : "+(aluno1.getAlunoAprovado2()));
		
		/*-------------------------------------------------------------------*/
		System.out.println("\n------------Utilizando toString mostrar no console------------------");
		
		System.out.println(aluno1.toString());
		System.out.println("Sua M�dia � :" +aluno1.getMedia());
		System.out.println("Resultado foi :"+aluno1.getAlunoAprovado2());
		
		
		
		
		System.out.println("\n----------------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Elaine Balico");
		aluno2.setIdade(37);
		aluno2.setDataNascimento("04/10/1985");
		aluno2.setRegistroGeral("7781342-0");
		aluno2.setNomeMae("Rosangela Balico");
		aluno2.setNomePai("Claudemir de Lima");
		aluno2.setDataMatricula("25/04/2022");
		aluno2.setNomeEscola("Escola JDEV Treinamentos");
		aluno2.setSerieMatriculado("1�");
		
		System.out.println("Ol� "+aluno2.getNome());
		
		System.out.println("A idade � : "+aluno2.getIdade());
		
		System.out.println("A data Nascimento � : "+aluno2.getDataNascimento());
				
		System.out.println("O RG � : "+aluno2.getRegistroGeral());
				
		System.out.println("Nome da m�e � :"+aluno2.getNomeMae());
				
		System.out.println("Nome do pai � :"+aluno2.getNomePai());
			
		System.out.println("A data da matr�cula � :"+aluno2.getDataMatricula());
				
		System.out.println("Nome " +aluno2.getNomeEscola());
				
		System.out.println("Matriculado " +aluno2.getSerieMatriculado());
		
		/*----------------------------------------------------------------------*/
		
		Aluno aluno3 = new Aluno();
		
		//passando valor padrao para construtor
		
		Aluno aluno4 = new Aluno("Maria");
		
		// passando valores padr�es para construtor
		
		Aluno aluno5 = new Aluno("Rafael", 39);
	}

}

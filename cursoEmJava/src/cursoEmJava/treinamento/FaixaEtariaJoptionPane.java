package cursoEmJava.treinamento;

import javax.swing.JOptionPane;

public class FaixaEtariaJoptionPane {
	public static void main(String[] args) {
		int anoNascimento = 0;
		
		System.out.println("Programa Faixa Jovem-Adulto-Idoso e data nascimento");
	
		
		
	
	
		String nomeUsuario = JOptionPane.showInputDialog("Digite nome do Usuário :");
		String idade = JOptionPane.showInputDialog("Digite a idade do Usuário");
		String anoAtual = JOptionPane.showInputDialog("Digite ano atual");
	
		
		int idadeUsuario = Integer.parseInt(idade);
		int anoAtualizado = Integer.parseInt(anoAtual);
		
		anoNascimento = anoAtualizado -  idadeUsuario  ;
	
		
		
	
			
			
		if (idadeUsuario >= 11 && idadeUsuario <=19) {
			JOptionPane.showMessageDialog(null,nomeUsuario+ " sua idade é :" +idadeUsuario+ " seu ano de nascimento  é : "
		+anoNascimento + " Você é JOVEM");
			
		}else if(idadeUsuario >= 20 && idadeUsuario <= 59) {
			JOptionPane.showMessageDialog(null,nomeUsuario+ " sua idade é :" +idadeUsuario+ " seu ano de nascimento  é : "
		+anoNascimento + " Você é ADULTO");
				
		}else if(idadeUsuario >= 60) {
			JOptionPane.showMessageDialog(null,nomeUsuario+ " sua idade é :" +idadeUsuario+ " seu ano de nascimento  é : "
					+anoNascimento + " Você é IDOSO");
		}else {
			JOptionPane.showMessageDialog(null,nomeUsuario+ " sua idade é :" +idadeUsuario+ " seu ano de nascimento  é : "
					+anoNascimento + " Você é CRIANÇA");
		}
		
		
		  
		
		

	  
		
	}

}

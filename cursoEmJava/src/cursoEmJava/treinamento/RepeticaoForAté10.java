package cursoEmJava.treinamento;

public class RepeticaoForAté10 {
	public static void main(String[] args) {
		
		String nome = "Rafael Morales";
		String curso = "Java";
		
		System.out.println("Programa Repetição 10Xxxx");
		
		if (curso.equals("Java")) {
			
			for(int numero = 0; numero <=10; numero++ ) {
				System.out.println("Olá aluno " +nome+ " esta cursando " +curso+ "" +numero);
				
			}
			
		}else {
			System.out.println("Olá " +nome+ " Você não esta cursando "+curso );
		}
		
				
	}

}

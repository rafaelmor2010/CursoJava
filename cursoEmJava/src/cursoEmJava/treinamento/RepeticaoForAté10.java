package cursoEmJava.treinamento;

public class RepeticaoForAt�10 {
	public static void main(String[] args) {
		
		String nome = "Rafael Morales";
		String curso = "Java";
		
		System.out.println("Programa Repeti��o 10Xxxx");
		
		if (curso.equals("Java")) {
			
			for(int numero = 0; numero <=10; numero++ ) {
				System.out.println("Ol� aluno " +nome+ " esta cursando " +curso+ "" +numero);
				
			}
			
		}else {
			System.out.println("Ol� " +nome+ " Voc� n�o esta cursando "+curso );
		}
		
				
	}

}

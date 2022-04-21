package cursoEmJava.treinamento;




public class VariavelGlobalMetodo {
	
	static int idadeRafa = 39;
	static int idadeElaine = 37;
	static int idadeGabri = 11;
	static int idadeLaura = 3;
	
	public static void main(String[] args) {
		
	metodoNomes();	
		
	}
	
	public static void metodoNomes() {
		
		String nome1 = "Rafael Morales";
		String nome2 = "Elaine Balico";
		String nome3 = "Laura Balico";
		String nome4 = "Gabriel Balico";
		
		System.out.println("A idade de " +nome1+ " é :" +idadeRafa);
		System.out.println("A idade de " +nome2+ " é :" +idadeElaine);
		System.out.println("A idade de " +nome4+ " é :" +idadeGabri);
		System.out.println("A idade de " +nome3+ " é :" +idadeLaura);
		
		
		boolean amorVerdade = true;
		if (amorVerdade == true) {
			
			System.out.println(nome1+ " e " +nome2+ " Se casaram tiveram filhos");
			System.out.println("Os nomes dos filhos são : " +nome3+ " e " +nome4);
		}else {
			System.out.println(nome1+ " e " +nome2+ " não se casaram ");
		}
		
		
	}
	

}

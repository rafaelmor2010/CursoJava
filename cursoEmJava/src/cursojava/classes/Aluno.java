package cursojava.classes;

/* Está é nossa classe/objeto que representa o Aluno*/
public class Aluno {
	//atributos- 
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	
	//metodo construtor
	//cria os dados na memoria do computador
	public Aluno() {
		
	}
	/*metodo construtor sempre o nome da classe Aluno sempre
	vai receber essse nome padrão*/
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
		
		
	}
	
	// construtor recebendo valores padrões
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		
	}
	
	/* metodos SETTERS e GETTERS*/
	/* SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/
	
	//método SET recebe dados
	public void setNome(String nome) {
		//this é usado para indicar atributo da classe Aluno
		this.nome = nome;
	}
	
	//Método GET retorna valor
	public String getNome () {
		return nome;
		
	}
	//Setters
	public void setIdade( int idade) {
		this.idade = idade;
		
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getRegistroGeral() {
		return registroGeral;
	}
	
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	public String getNumeroCpf() {
		return numeroCpf;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	
	/*---------------------------------------------------------*/
	public void setNota1 (double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota2 (double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota3 (double nota3) {
		this.nota3 = nota3;
	}
	
	public double getNota3() {
		return nota3;
	}
	
	public void setNota4 (double nota4) {
		this.nota4 = nota4;
	}
	
	public double getNota4() {
		return nota4;
	}
	
	/*Método get para calcular média das notas*/
	public double getMedia() {
		return (nota1 + nota2 + nota3 + nota4 )/4;
	}
	
	/*Método get media Apovado ou reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMedia();
		if(media>=70) {
			
		
		return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMedia();
		if(media >= 70) {
			return "Aluno Aprovado";
		}else {
			return "Aluno Reprovado";
		}
	}
	

	
}

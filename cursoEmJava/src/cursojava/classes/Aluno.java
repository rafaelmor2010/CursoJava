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
	
//chamando a o objeto da classe Disciplina
	
	Disciplina disciplina = new Disciplina();
	//usando set e get da classe Disciplina
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
		
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
		
	}
	
	
	
	
	
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

	
	
	
	
	
	
	
	/*pecando do obejeto Disciplina Método get para calcular média das notas*/
	public double getMedia() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4() )/4;
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
	/*Utilizando metodo toString para mostrar os dados no console*/
	
	
	
	
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		return true;
	} 
	
	/*para poder verificar se tem igual mesmo CPF e Rg    equals e hashCode*/
	
	
	
	
}

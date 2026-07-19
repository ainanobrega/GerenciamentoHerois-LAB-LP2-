package Model;

public class Heroi {
	private int codigoNumerico;
	private String nomeVerdadeiro;
	private String codinome;
	private int energia;
	private int experiencia;

	public Heroi(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia) {
		this.codigoNumerico = codigoNumerico;
		this.nomeVerdadeiro = nomeVerdadeiro;
		this.codinome = codinome;
		this.energia = energia;
		this.experiencia = experiencia;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public String getNomeVerdadeiro() {
		return nomeVerdadeiro;
	}

	public String getCodinome() {
		return codinome;
	}

	public int getEnergia() {
		return energia;
	}
	
	public boolean validacaoHeroi (int valor) {
		if (valor < 0) {
			return false;
		}
		return true;
	}
	
	public String registrarConclusaoMissao() {
		experiencia += 5;
		return ""+ codinome +" concluiu a missao. Experiencia recebida: 5 pontos.";
	}
	
	public int calcularForcaTotal() {
		return experiencia + energia;
	}
	public String descricaoHabilidade() {
		return ""+ codinome +" utiliza uma habilidade durante a missao.";
	}
	
	public String executarHabilidade() {
		if (energia >= 10) {
			String descricao = descricaoHabilidade();
			energia -= 10;
			return descricao;
		}
		return ""+ codinome +" nao possui energia suficiente para utilizar sua habilidade.";
	}
	
	@Override
	public String toString() {
		return "Codigo: " + codigoNumerico + "\n" +
		           "Nome verdadeiro: " + nomeVerdadeiro + "\n" +
		           "Codinome: " + codinome + "\n" +
		           "Energia: " + energia + "\n" +
		           "Experiencia: " + experiencia;
	}

}

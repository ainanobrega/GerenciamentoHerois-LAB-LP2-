package Model;

public class HeroiMistico extends Heroi {

	private String origemPoder;
	private int nivelMagia;

	public HeroiMistico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, String origemPoder, int nivelMagia) {
		super(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia);
		this.origemPoder = origemPoder;
		this.nivelMagia = nivelMagia;
	}

	@Override
	public int calcularForcaTotal() {
		return getEnergia() + getExperiencia() + (4 * nivelMagia);
	}

	@Override
	public String descricaoHabilidade() {
		return "" + getCodinome() + " invoca os poderes do " + origemPoder + " e cria um poderoso feitico.";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nOrigem do poder: " + origemPoder + "\nNivel de magia: " + nivelMagia;	
	}
}


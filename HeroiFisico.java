package Model;

public class HeroiFisico extends Heroi {

	private int nivelForca;

	public HeroiFisico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, int nivelForca) {
		super(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia);
		this.nivelForca = nivelForca;
	}

	@Override
	public int calcularForcaTotal() {
		return getEnergia() + getExperiencia() + (2 * nivelForca);
	}

	@Override
	public String descricaoHabilidade() {
		return ""+getCodinome () +" golpeia o inimigo utilizando sua forca extraordinaria.";
	} 
	
	@Override
	public String toString() {
		return super.toString() + "\nNivel de forca: " + nivelForca;
	}
	
	
}

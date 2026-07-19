package Model;

public class HeroiTecnologico extends Heroi {

	private String equipamentoPrincipal;
	private int nivelTecnologico;

	public HeroiTecnologico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, String equipamentoPrincipal, int nivelTecnologico) {
		super(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia);
		this.equipamentoPrincipal = equipamentoPrincipal;
		this.nivelTecnologico = nivelTecnologico;
	}

	@Override
	public int calcularForcaTotal() {
		return getEnergia() + getExperiencia() + (3 * nivelTecnologico);
	}

	@Override
	public String descricaoHabilidade() {
		return ""+getCodinome() +" ativa a "+ equipamentoPrincipal +" e dispara seus dispositivos tecnologicos.";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEquipamento principal: " + equipamentoPrincipal + "\nNivel tecnologico: " + nivelTecnologico;	
	}
}

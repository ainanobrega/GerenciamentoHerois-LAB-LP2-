package Model;

import java.util.ArrayList;
import java.util.List;

public class SistemaHeroi {
	private List<Heroi> herois;

	public SistemaHeroi() {
		herois = new ArrayList<>();
	}

	public boolean cadastrarHeroiFisico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, int nivelForca) {
		if (codigoNumerico < 0 || energia < 0 || experiencia < 0 || nivelForca < 0) {
			return false;
		}
		if (buscarHeroi(codigoNumerico) != null) {
			return false;
		}
		HeroiFisico heroi = new HeroiFisico(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia, nivelForca);
		herois.add(heroi);
		return true;
	}

	public boolean cadastrarHeroiTecnologico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, String equipamentoPrincipal, int nivelTecnologico) {
		if (codigoNumerico < 0 || energia < 0 || experiencia < 0 || nivelTecnologico < 0) {
			return false;
		}
		if (buscarHeroi(codigoNumerico) != null) {
			return false;
		}
		HeroiTecnologico heroi = new HeroiTecnologico(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia, equipamentoPrincipal, nivelTecnologico);
		herois.add(heroi);
		return true;
	}

	public boolean cadastrarHeroiMistico(int codigoNumerico, String nomeVerdadeiro, String codinome, int energia, int experiencia, String origemPoder, int nivelMagia) {
		if (codigoNumerico < 0 || energia < 0 || experiencia < 0 || nivelMagia < 0) {
			return false;
		}
		if (buscarHeroi(codigoNumerico) != null) {
			return false;
		}
		HeroiMistico heroi = new HeroiMistico(codigoNumerico, nomeVerdadeiro, codinome, energia, experiencia, origemPoder, nivelMagia);
		herois.add(heroi);
		return true;
	}

	public Heroi buscarHeroi(int codigoNumerico) {
		for (Heroi h : herois) {
			if (h.getCodigoNumerico() == codigoNumerico) {
				return h;
			}
		}
		return null;
	}

	public int contarHerois() {
		return herois.size();
	}

	public String retornarInformacoesHeroi(int codigoNumerico) {
		Heroi h = buscarHeroi(codigoNumerico);
		if (h == null) {
			return "Heroi nao encontrado.";
		}
		return h.toString();
	}

	public String exibirTodosHerois() {
		if (herois.isEmpty()) {
			return "Nenhum heroi cadastrado.";
		}

		String texto = "";
		for (int i = 0; i < herois.size(); i++) {
			Heroi h = herois.get(i);
			texto = texto + h.toString();

			if (i < herois.size() - 1) {
				texto = texto + "\n\n";
			}
		}
		return texto;
	}

	public String utilizarHabilidadeHeroi(int codigo) {
	        Heroi h = buscarHeroi(codigo);
	        if (h == null) {
	            return "Heroi nao encontrado.";
	        }
	        return h.executarHabilidade();
	}
	
	public String executarHabilidadesDeTodos() {
        if (herois.isEmpty()) {
            return "Nenhum heroi cadastrado.";
        }

        String texto = "";
        for (int i = 0; i < herois.size(); i++) {
            Heroi h = herois.get(i);
            texto = texto + h.executarHabilidade();

            if (i < herois.size() - 1) {
                texto = texto + "\n";
            }
        }
        return texto;
    }
	
	public String registrarConclusaoMissao(int codigoNumerico) {
        Heroi heroi = buscarHeroi(codigoNumerico);
        if (heroi == null) {
            return "Heroi nao encontrado.";
        }
        return heroi.registrarConclusaoMissao();
    }
	
	public int calcularForcaTotal(int codigoNumerico) {
        Heroi heroi = buscarHeroi(codigoNumerico);
        if (heroi == null) {
            return 0;
        }
        return heroi.calcularForcaTotal();
    }
	
	public int calcularForcaTotalEquipe() {
        int somaTotal = 0;
        for (Heroi h : herois) {
            somaTotal += h.calcularForcaTotal();
        }
        return somaTotal;
	}
	
	 public Heroi encontrarHeroiMaisForte() {
		 if (herois.isEmpty()) {
			 return null;
		 }

		 Heroi maisForte = herois.get(0);
		 for (Heroi h : herois) {
			 if (h.calcularForcaTotal() > maisForte.calcularForcaTotal()) {
				 maisForte = h;
			 }
		 }
		 return maisForte;
	 }
	
}
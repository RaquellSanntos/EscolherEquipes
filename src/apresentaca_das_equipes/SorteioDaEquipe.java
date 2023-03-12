package apresentaca_das_equipes;

import java.util.ArrayList;
import java.util.List;

public class SorteioDaEquipe {

	public static void main(String[] args) {
		 List<Equipe> equipes = new ArrayList<>();
	        equipes.add(new Equipe("Equipe DULEIT"));
	        equipes.add(new Equipe("Equipe GG"));
	        equipes.add(new Equipe("Equipe CAVALEIROSDA PROGRAMAÇÃO"));
	        equipes.add(new Equipe("Equipe SEM NOME"));
	        equipes.add(new Equipe("Equipe SLYTHERI"));
	        equipes.add(new Equipe("Equipe GAROTOS DE PROGRAMAS"));

	        SorteadorDeEquipes sorteador = new SorteadorDeEquipes(equipes);
	        Equipe equipeSorteada = sorteador.sortearEquipe();

	        System.out.println("  A equipe sorteada foi: " );
	        System.out.println("  "+ equipeSorteada.getNome());
	}

}

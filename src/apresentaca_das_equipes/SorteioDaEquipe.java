package apresentaca_das_equipes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SorteioDaEquipe {

	public static void main(String[] args) {
		 List<Equipe> equipes = new ArrayList<>();
	        equipes.add(new Equipe("Equipe DULEIT"));
	        equipes.add(new Equipe("Equipe GG"));
	        equipes.add(new Equipe("Equipe CAVALEIROS DA PROGRAMAÇÃO"));
	        equipes.add(new Equipe("Equipe SEM NOME"));
	        equipes.add(new Equipe("Equipe SLYTHERI"));
	        equipes.add(new Equipe("Equipe GAROTOS DE PROGRAMAS"));

	        SorteadorDeEquipes sorteador = new SorteadorDeEquipes(equipes);
	        Equipe equipeSorteada = sorteador.sortearEquipe();

	        PrintStream out = System.out;
	       // out.print("\033[31m"); // define a cor vermelha
	     // out.print("\033[34m"); // define a cor azul
	        System.out.println("  A equipe sorteada foi:" );
	        out.print("\033[32m"); // define a cor verde
	        System.out.println("  "+ equipeSorteada.getNome());
	        out.print("\033[0m"); // volta à cor padrão
	}

}

package apresentaca_das_equipes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteadorDeEquipes {
    private List<Equipe> equipes;

    public SorteadorDeEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public Equipe sortearEquipe() {
        Random random = new Random();
        int equipeAleatorio = random.nextInt(equipes.size());
        return equipes.get(equipeAleatorio);
    }
}

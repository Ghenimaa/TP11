package exemple;

import java.util.ArrayList;
import bandeau.Bandeau;

public class Scenario {
    private ArrayList<Effet> scenariosliste;

    public Scenario() {

    }

    public void ajoutereffetScenario(Effet effet, int temps) {
        for (int i = 0; i < temps; i++) {
            scenariosliste.add(effet);
        }
    }

    public void montreEffet(Bandeau bandeau) {
        for (Effet effet : scenariosliste) {
            effet.afficheEffetBandeau(bandeau);
        }
    }

}






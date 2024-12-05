package exemple;

import bandeau.Bandeau;

public class Clignotant extends Effet {
    private int nbclignotants;

    public Clignotant() {
        super();
    }

    // Implémentation de la méthode afficherBandeau
    @Override
    public void afficherBandeau(Bandeau bandeau, String message) {
        int nbClignotement = 5;
        for (int i = 0; i < nbClignotement; i++) {
            bandeau.setMessage(message);
            bandeau.sleep(500);
            bandeau.setMessage("");
            bandeau.sleep(200);
        }
    }


    @Override
    public void afficheEffetBandeau(Bandeau bandeau) {
        afficherBandeau(bandeau, "Clignotant");
    }

    public void afficheEffetBandeau(Bandeau bandeau) {
        afficherBandeau(bandeau, "Clignotant", nbclignotants);
    }
}

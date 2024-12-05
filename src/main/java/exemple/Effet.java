package exemple;
import bandeau.Bandeau;
import java.util.Random;


public abstract class Effet {

    public Effet() {
    }
    public abstract void afficherBandeau(Bandeau b, String message);
    public abstract void afficheEffetBandeau(Bandeau bandeau);
}




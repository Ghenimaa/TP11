package exemple;
import bandeau.Bandeau;
import java.util.Random;


public class JeuDuPendu extends Effet{
    public JeuDuPendu() {
        super();
    }
    public void afficheEffetBandeau(Bandeau bandeau, String message) {
        Random random = new Random();
        StringBuilder mot = new StringBuilder();
        int compteur = 0;
        for (int i = 0; i < message.length(); i++) {
            mot.append("_");
        }
        bandeau.setMessage(mot.toString());
        bandeau.sleep(300);
        int lettresDevinees = 0;
        while (lettresDevinees < message.length()) {
            int index = random.nextInt(message.length());
            if (mot.charAt(index) == '_') {
                mot.setCharAt(index, message.charAt(index));
                lettresDevinees = lettresDevinees + 1;
                bandeau.setMessage(mot.toString());
                bandeau.sleep(200);
            }
        }
    }

    public void afficheEffetBandeau(Bandeau bandeau) {
        afficheEffetBandeau(bandeau, "Jeu du pendu");
    }




    }



package exemple;
import bandeau.Bandeau;

public class TeleType extends Effet{

        public TeleType() {
            super();
        }

        @Override
        public void afficherBandeau(Bandeau bandeau, String message) {
            StringBuilder texteProgressif = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                texteProgressif.append(message.charAt(i));
                bandeau.setMessage(texteProgressif.toString());
                bandeau.sleep(200);
            }
        }

        @Override
        public void afficheEffetBandeau(Bandeau bandeau) {
            afficherBandeau(bandeau, "TeleType");
        }
    }


import java.time.LocalDate;

public class Message extends Billet{
    private String contenu;
    public Message(LocalDate date, String auteur_billet, String contenu) {
        super(date, auteur_billet);
        this.contenu = contenu;
    }
    public String getContenu() {
        return contenu;
    }
}

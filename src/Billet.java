import java.time.LocalDate;
public class Billet implements  Publiable{
    protected LocalDate date;
    protected String auteur_billet;
    public Billet(LocalDate date, String auteur_billet) {
        this.date = date;
        this.auteur_billet = auteur_billet;
    }
    public String toString() {
        return "Billet [date=" + date + ", auteur_billet=" + auteur_billet + "]";
    }
    public LocalDate getDatePublication() {
        return this.date;
    }
    public String getAuteur() {
        return this.auteur_billet;
    }
}

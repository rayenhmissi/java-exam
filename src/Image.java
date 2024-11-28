import java.time.LocalDate;
public class Image  extends Billet_taggable {
    private String url;
     public Image(LocalDate date, String auteur_billet, String[] lTags, int nbTags, String url) {
        super(date, auteur_billet, lTags, nbTags);
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public String toString() {
        return "Image [url=" + url + ", date=" + date + ", auteur_billet=" + auteur_billet + ", lTags="+ lTags + ", nbTags=" + nbTags + "]";
    }
 }

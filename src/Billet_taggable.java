import java.time.LocalDate;
import java.util.Arrays;
public class Billet_taggable extends Billet implements Taggable{
    protected String[] lTags;
    protected int nbTags;
    private int n=0;
    public Billet_taggable(LocalDate date, String auteur_billet, String[] lTags, int nbTags) {
        super(date, auteur_billet);
        this.lTags = lTags;
        this.nbTags=nbTags;
    }
    public String toString() {
        return "Billet_taggable [lTags=" + Arrays.toString(lTags) + ", date=" + date + ", nbTags=" + nbTags
                + ", auteur_billet=" + auteur_billet + "]";
    }
    public void ajoutTag(String tag){
        boolean r=true;
        for (int i=0;i < this.nbTags && r != false;i++){
            if (this.lTags[i]==tag){
                r=true;
            }
            else{
                r=false;
            }
        }
        if (n==nbTags){
            System.out.println("tableau est rempli");
        }
        if (r==false){
            System.out.println("tag existe déja");
        }
        else{
            lTags[n]=tag;
            n++;
        }
    }
    public void supprimeTag(String tag){
        for (int i=0;i < n;i++){
            if (lTags[i]==tag){
                int in=i;
                lTags[i]=lTags[i+1];
                for (int j=in;j < n;j++){
                    lTags[j]=lTags[j+1];
                    n-=1;
                }        
            }
        }
    }
    public int rechercheTag(String tag){
        boolean r1=true;
        for (int i=0;i < n || r1==false;i++){
            if (lTags[i] == tag){
                r1=true;
                return i;
            }
            else{
                r1=false;
            }
        }
        return i;
    }
    public int nombreTags(){
        return n=nbTags;
    }
}

public class Main {
    public static void main(String[] args) {

        Personne pers = new Personne('testnom','testpre');

    }
}


package personnes;

abstract class Personne{

    protected String nom;
    protected String prenom;
    public Personne(String nom,String prenom){
        this.nom=validerChaine(nom,50);
        this.prenom=validerChaine(prenom,30);
    }
    public boolean validerChaine(String chaine, int taille) {
        return chaine != null && chaine.length() <= taille;
    }
    public String toString(){
        return this.nom+""+this.prenom;
    }

}


class Architecte extends Personne{

    private String conseilRegional;
    private String telephone;
    private Adresse adresse;
    private boolean inscriptionOrdre;

    public Architecte(String nom,String prenom,String conseilRegional,boolean inscriptionOrdre,Adresse adresse,String telephone){
        super(nom,prenom);
        this.conseilRegional=conseilRegional;
        this.inscriptionOrdre=inscriptionOrdre;
        this.adresse=adresse;

        if(telephoneValide(telephone)){
            this.telephone=telephone;
        }
        else {
            this.telephone="";
        }
        Maj_conseilRegional();
    }

    public boolean telephoneValide(String telephone) {
        return telephone != null && !telephone.contains(" ") && telephone.length() <= 15;
    }


    public void Maj_conseilRegional(boolean Inscrit) {
            String inscription = Inscrit ? "inscrit" : "non inscrit";
            return nom + " " + prenom + " " + conseilRegional + " " + inscription ;
        }


    @java.lang.Override
    public String toString() {
        return super.toString();
    }
}


class Deposant extends Personne{
    private String genre;
    private String mail;
    private Adresse adresse;
    public Deposant(String nom,String prenom,String genre,String mail,Adresse adresse){
        super(nom,prenom);
        this.genre=genre;
        this.mail=mail;
        this.adresse=adresse;


    }

    @java.lang.Override
    public String toString() {
        return super.toString();
    }
}


class Adresse{
    private String numero;
    private String voie;
    private String ville;
    private String cp;
    public Adresse(String numero,String voie,String ville,String cp){
        this.numero=numero;
        this.voie=voie;
        this.ville=ville;
        this.cp=cp;
    }

    public boolean validerChaine(String chaine, int taille) {
        return chaine != null && chaine.length() <= taille;
    }


}
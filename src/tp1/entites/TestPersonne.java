package tp1.entites;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne();
		personne1.nom = "BLANC";
		personne1.prenom = "Anthony";
		personne1.adressePostale = new AdressePostale();
		Personne personne2 = new Personne();
		personne2.nom = "DOE";
		personne2.prenom = "Matthieu";
		personne2.adressePostale = new AdressePostale();
	}
	
}

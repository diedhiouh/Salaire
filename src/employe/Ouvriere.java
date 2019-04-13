package employe;

import salaire.*;

public class Ouvriere implements IElement{

	double salaire;
	int NbreHeure;
	
	public Ouvriere(double salaire, int nbreHeure) {
	    super();
	    this.salaire = salaire;
	    this.NbreHeure = nbreHeure;
    }
	
	public double getSalaire() {
		return salaire;
	}

	public int getNbreHeure() {
		return NbreHeure;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setNbreHeure(int nbreHeure) {
		NbreHeure = nbreHeure;
	}

	public Ouvriere() {
		// TODO Auto-generated constructor stub
	}

	//Fonction accept visiteur
	@Override
    public void acceptVisiteur(IVisiteur v) {
	    // TODO Auto-generated method stub
	    v.SalaireOuvriere(this);
    }

}

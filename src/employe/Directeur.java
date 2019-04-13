package employe;

import salaire.*;

public class Directeur implements IElement{

	double indice;
	double salaire;
	double bonus;
	
	public Directeur() {
		// TODO Auto-generated constructor stub
	}

	public Directeur(double indice, double salaire, double bonus) {
	    super();
	    this.indice = indice;
	    this.salaire = salaire;
	    this.bonus = bonus;
    }

	public double getIndice() {
		return indice;
	}

	public double getSalaire() {
		return salaire;
	}

	public double getBonus() {
		return bonus;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//Fonction accept visiteur
	@Override
    public void acceptVisiteur(IVisiteur v) {
	    // TODO Auto-generated method stub
	    v.SalaireDirecteur(this);
    }

}

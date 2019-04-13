package salaire;

import employe.Commerciaux;
import employe.Directeur;
import employe.Manager;
import employe.Ouvriere;

public class CalculSalaire implements IVisiteur{

	double salaire;
	
	public CalculSalaire() {
		// TODO Auto-generated constructor stub
	}

	
	//Fonctions de calcul de salaire des employes
	
	public double getSalaire() {
		return salaire;
	}

	@Override
    public void SalaireDirecteur(Directeur d) {
	    // TODO Auto-generated method stub
	    salaire=(d.getIndice()*d.getSalaire())+d.getBonus();
    }

	@Override
    public void SalaireManager(Manager m) {
	    // TODO Auto-generated method stub
	   salaire=(m.getIndice()*m.getPrime())+m.getPrime()-m.getImpot();
    }

	@Override
    public void SalaireCommerciaux(Commerciaux c) {
	    // TODO Auto-generated method stub
	    salaire=c.getPrimeVente()+10000;
    }

	@Override
    public void SalaireOuvriere(Ouvriere o) {
	    // TODO Auto-generated method stub
	    salaire=(o.getSalaire()*o.getNbreHeure())+5000;
    }

}

package employe;

import salaire.*;

public class Commerciaux implements IElement{

	double primeVente;
	
	public Commerciaux() {
		// TODO Auto-generated constructor stub
	}
	
	public Commerciaux(double primeVente) {
	    super();
	    this.primeVente = primeVente;
    }
	
	public double getPrimeVente() {
		return primeVente;
	}

	public void setPrimeVente(double primeVente) {
		this.primeVente = primeVente;
	}


	@Override
    public void acceptVisiteur(IVisiteur v) {
	    // TODO Auto-generated method stub
	    v.SalaireCommerciaux(this);
    }

}

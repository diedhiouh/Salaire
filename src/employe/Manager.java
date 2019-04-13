package employe;

import salaire.*;

public class Manager implements IElement{

	double indice;
	double salaire;
	double prime;
	double impot;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(double indice, double salaire, double prime, double impot) {
	    super();
	    this.indice = indice;
	    this.salaire = salaire;
	    this.prime = prime;
	    this.impot = impot;
    }

	public double getIndice() {
		return indice;
	}

	public double getSalaire() {
		return salaire;
	}

	public double getPrime() {
		return prime;
	}

	public double getImpot() {
		return impot;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}

	public void setImpot(double impot) {
		this.impot = impot;
	}

	@Override
    public void acceptVisiteur(IVisiteur v) {
	    // TODO Auto-generated method stub
	    v.SalaireManager(this);
    }

}

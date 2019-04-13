package salaire;

import employe.*;

public interface IVisiteur {

	void SalaireDirecteur(Directeur d);
	void SalaireManager(Manager d);
	void SalaireCommerciaux(Commerciaux d);
	void SalaireOuvriere(Ouvriere d);
}

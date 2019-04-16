# SalaireService

Calcul du salaire des employés d'un service ou d'une entreprise

voici les formules de calcul de salaire des employés:

-Le Directeur: Indice x salire de base + Bonus

-Le Manager: Indice x salaire de base + (prime-impôt)

-Commerciaux: PrimeVente + 10000

-Ouvriers: Saliaire x NbreHeure + 5000

On va utilise la conception des Patterns pour faire l'exercice. Dans cet exercie, 
nous choisissons le Pattern Visiteur pour calculer les salaire des differents employés.

## DEMARCHE DU PATTERN VISITOR 

 ### 1) Creer notre classe nommé "Service" qui est composé d'une interface "IVisitor" et une Classe "Personnnel".
 
### 2) Dans IVisiteur, on definit les methodes:
 
        void SalaireDirecteur(Directeur d);
        void SalaireManager(Manager d);
        void SalaireCommerciaux(Commerciaux d);
        void SalaireOuvriere(Ouvriere d);
        
    Ces methodes qui seront implementées par la Classe 'CalculSalaire" serviront respectiement à 
    calculer le salaire des differents individus
    
### 3) La Classe Personnel est composé de l'interface IElement qui definit la methode acceptVisiteur

### 4) Les classe Directeur, Manager, Commerciaux, Ouvriers vont implementer la Classe IElement et la fonction acceptVisiteur.

### 5) Classe Tester contient la methode Main de notre application.


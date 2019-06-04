package dev;

public class Vehicule {
	// Modele du vehicule
	protected String modele;
	// Année d'achat du vehicule
	protected int anneeAchat;
	// Prix d'achat du vehicule
	protected float prixAchat;
	// Numereau d'imatriculation du vehicule
	protected String numeroImatriculation;
	// Type de permis pour conduire ce vehicule
	protected char permis;
	// Constante dee l'année courrante
	protected final int ANNEE_COURANTE = 2019;

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnneeAchat() {
		return anneeAchat;
	}

	public void setAnneeAchat(int anneeAchat) {
		this.anneeAchat = anneeAchat;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getNumeroImatriculation() {
		return numeroImatriculation;
	}

	public void setNumeroImatriculation(String numeroImatriculation) {
		this.numeroImatriculation = numeroImatriculation;
	}

	public char getPermis() {
		return permis;
	}

	public void setPermis(char permis) {
		this.permis = permis;
	}

	public Vehicule(String modele, int anneeAchat, float prixAchat, String numeroImatriculation, char permis) {
		this.modele = modele;
		this.anneeAchat = anneeAchat;
		this.prixAchat = prixAchat;
		this.numeroImatriculation = numeroImatriculation;
		this.permis = permis;
	}

	/**
	 * Calcule l'age du vehicule en fonction de la dates d'achat et l'année courante
	 * 
	 * @return int
	 */
	public int age() {
		int age = this.ANNEE_COURANTE - this.anneeAchat;
		return age;
	}

	/**
	 * Affiche les information du vehicule
	 */
	public void afficherVehicule() {
		System.out.println(this.toString());
	}

	/**
	 * Calcul le cout de location en fonction de la date d'achat et du prix d'achat
	 * 
	 * @return float
	 */
	public float coutLocation() {
		if (this.age() < 1) {
			return this.prixAchat / 200;
		} else {
			return this.prixAchat / 250;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String affiche = this.modele + " acheté en " + this.anneeAchat + " : " + prixAchat + "€ - imatriculation : "
				+ this.numeroImatriculation + " - Type permis :" + this.permis;
		return affiche;
	}
}

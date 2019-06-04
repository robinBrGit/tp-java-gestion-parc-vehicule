package dev;

public final class Voiture extends Vehicule {

	private boolean autoradio;

	public boolean isAutoradio() {
		return autoradio;
	}

	public void setAutoradio(boolean autoradio) {
		this.autoradio = autoradio;
	}

	public Voiture(String modele, int anneeAchat, float prixAchat, String numeroImatriculation, char permis,
			boolean autoradio) {
		super(modele, anneeAchat, prixAchat, numeroImatriculation, permis);
		this.autoradio = autoradio;
	}

	/**
	 * Ajoute un autoradio a la voiture
	 */
	public void ajouterAutoRadio() {
		this.autoradio = true;
	}

	/**
	 * Enleve l'autoradio de la voiture
	 */
	public void enleverAutoRadio() {
		this.autoradio = false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Autoradio :" + ((this.autoradio) ? " Oui" : " Non");
	}
}

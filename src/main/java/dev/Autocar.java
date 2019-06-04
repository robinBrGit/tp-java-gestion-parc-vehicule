package dev;

public final class Autocar extends Camion {

	private short nbPassager;

	public short getNbPassager() {
		return nbPassager;
	}

	public void setNbPassager(short nbPassager) {
		this.nbPassager = nbPassager;
	}

	public Autocar(String modele, int anneeAchat, float prixAchat, String numeroImatriculation, char permis,
			float volume, short nbPassager) {
		super(modele, anneeAchat, prixAchat, numeroImatriculation, permis, volume);
		this.nbPassager = nbPassager;
	}

	/**
	 * calcule si l'autocars peut transporter le nombre de passagers et le volume de
	 * bagage
	 * 
	 * @param nbPassager
	 * @param volumeBagage
	 * @return boolean
	 */
	public boolean peutTransporterPassagers(int nbPassager, float volumeBagage) {
		if (this.nbPassager >= nbPassager && this.volume >= volumeBagage)
			return true;
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Nombre de passager : " + this.nbPassager;
	}

}

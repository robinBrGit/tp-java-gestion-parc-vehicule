package dev;

public class Camion extends Vehicule {

	protected float volume;

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public Camion(String modele, int anneeAchat, float prixAchat, String numeroImatriculation, char permis,
			float volume) {
		super(modele, anneeAchat, prixAchat, numeroImatriculation, permis);
		this.volume = volume;
	}

	/**
	 * Calcule si le camion peut transporter le volume passer en param
	 * 
	 * @param volume
	 * @return boolean
	 */
	public boolean peutTransporterVolume(float volume) {
		if (this.volume > volume)
			return true;
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Volume :" + this.volume + " m³";
	}
}

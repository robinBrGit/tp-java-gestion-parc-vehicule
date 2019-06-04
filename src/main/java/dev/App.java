package dev;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Voiture uneVoiture = new Voiture("Clio", 2012, 13000, "GH-547-TG", 'B', true);
		Camion unCamion = new Camion("Iveco Eurocargo", 2015, 35000, "ED-787-GH", 'C', 115);
		Autocar unAutocars = new Autocar("Fiat 306", 1998, 30000, "DS-741-FG", 'D', 54, (short) 10);

		uneVoiture.afficherVehicule();
		unCamion.afficherVehicule();
		unAutocars.afficherVehicule();

		Voiture uneVoiture2 = new Voiture("Twingo", 2019, 10000, "1234-AZ-49", 'B', true);
		uneVoiture2.afficherVehicule();

		Camion unCamion2 = new Camion("J9", 2014, 20000, "987-BCD-75", 'B', 25);
		unCamion2.afficherVehicule();
		System.out.println((unCamion2.peutTransporterVolume(7)) ? "Oui" : "Non");

		System.out.println("Cout de location " + uneVoiture2.getModele() + " : " + uneVoiture2.coutLocation() + " €/j");
		System.out.println("Cout de location " + unCamion2.getModele() + " : " + unCamion2.coutLocation() + " €/j");

		Autocar unAutocar2 = new Autocar("FRI", 2005, 90000, "4567WX01", 'D', 3, (short) 53);
		System.out.println("Ce camion peut transporter 40 passagers et 0.1 m³ de bagage par personne ?"
				+ ((unAutocar2.peutTransporterPassagers(40, 40 * 0.1f)) ? " Oui" : " Non"));
	}
}

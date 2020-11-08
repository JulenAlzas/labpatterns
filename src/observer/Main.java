package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory factory= new SymptomFactory();
//		Observable pacient=new Covid19Pacient("aitor", 35,factory);
//		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
//		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
//		
//		Observable pacient_julen=new Covid19Pacient("julen", 20,factory);
//		PacientObserverGUI pacient_julenGUI= new PacientObserverGUI (pacient_julen);
//		PacientSymptomGUI framepacient_julen = new PacientSymptomGUI ((Covid19Pacient) pacient_julen);
		
		Observable pacient=new Covid19Pacient("aitor", 35,factory);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient)pacient);
		PacientThermometerGUI thermometer= new PacientThermometerGUI((Covid19Pacient)pacient);
		
		Observable pacientjulen=new Covid19Pacient("julen", 21,factory);
		PacientObserverGUI pacientGUIjulen= new PacientObserverGUI (pacientjulen);
		PacientSymptomGUI framejulen = new PacientSymptomGUI ((Covid19Pacient)pacientjulen);
		PacientThermometerGUI thermometerjulen= new PacientThermometerGUI((Covid19Pacient)pacientjulen);
		
		Observable pacientalain=new Covid19Pacient("alain", 20,factory);
		PacientObserverGUI pacientGUIalain= new PacientObserverGUI (pacientalain);
		PacientSymptomGUI framealain = new PacientSymptomGUI ((Covid19Pacient)pacientalain);
		PacientThermometerGUI thermometeralain= new PacientThermometerGUI((Covid19Pacient)pacientalain);
//		SemaphorGUI semaforoa= new SemaphorGUI((Covid19Pacient)pacient);
		
//		Observable pacient_julen=new Covid19Pacient("julen", 21);
//		PacientObserverGUI pacientGUI_julen= new PacientObserverGUI (pacient_julen);
//		PacientSymptomGUI frame_julen = new PacientSymptomGUI ((Covid19Pacient)pacient_julen);
//		PacientThermometerGUI thermometer_julen= new PacientThermometerGUI((Covid19Pacient)pacient_julen);
//
//		Observable pacient_ander=new Covid19Pacient("julen", 21);
//		PacientObserverGUI pacientGUI_ander= new PacientObserverGUI (pacient_ander);
//		PacientSymptomGUI frame_ander= new PacientSymptomGUI ((Covid19Pacient)pacient_ander);
//		PacientThermometerGUI thermometer_ander= new PacientThermometerGUI((Covid19Pacient)pacient_ander);
		
	}


}

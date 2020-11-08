package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient)pacient);
		PacientThermometerGUI thermometer= new PacientThermometerGUI((Covid19Pacient)pacient);
		SemaphorGUI semaforoa= new SemaphorGUI((Covid19Pacient)pacient);
		
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

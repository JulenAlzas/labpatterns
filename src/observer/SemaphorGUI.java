package observer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer {
	private Observable obs;
	private Container a;
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		this.obs=obs;
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		a = getContentPane();
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		this.obs.addObserver(this);
	}
	
	public void update(Observable	o, Object arg)	{
		Covid19Pacient	p=(Covid19Pacient)o;
//			Obtain	the		current covidImpact	to	paint
		int farenheit =	(int)	p.covidImpact();	
//			temperature	gauge	update
		if(farenheit<5) {
			a.setBackground(Color.green);
		}else if(farenheit>5 && farenheit<10){
			a.setBackground(Color.yellow);
		}else if (farenheit>10) {
			a.setBackground(Color.red);
		}
		repaint();
		}

}     


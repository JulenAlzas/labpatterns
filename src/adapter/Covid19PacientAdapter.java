package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;
import iterator.Covid19PacientIterator;
import adapter.Iterator1;

public class Covid19PacientAdapter extends Covid19Pacient{

	public Covid19PacientAdapter(String name, int years) {
		super(name, years);
	}
	
	public InvertedIterator iteratorAdapter(){
		return new Iterator1(new ArrayList<Symptom>(this.getSymptoms()));
	}

}

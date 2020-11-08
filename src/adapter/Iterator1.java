package adapter;

import java.util.ArrayList;
import java.util.List;

import domain.Symptom;

public class Iterator1 implements InvertedIterator {
	private List<Symptom> sintomalista;
	private int position;
	
	public Iterator1(List<Symptom> sintomalista) {
		super();
		this.sintomalista = sintomalista;
		this.position = sintomalista.size();
	}

	@Override
	public Object previous() {
		if(position<sintomalista.size()-1) {
			return this.sintomalista.get(position--);
		}else {
			position--;
			return this.sintomalista.get(sintomalista.size()-1);
		}
		
		
	}

	@Override
	public boolean hasPrevious() {
		if(position>=0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void goLast() {
		this.position= this.sintomalista.size()-1;
		
	}

}

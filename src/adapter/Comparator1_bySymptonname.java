package adapter;

import domain.Symptom;

public class Comparator1_bySymptonname implements java.util.Comparator{
	
	public Comparator1_bySymptonname() {
		super();

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(((Symptom) o1).getName().compareTo(((Symptom) o2).getName())>0) {
			return 1;
		}else if(((Symptom) o1).getName().compareTo(((Symptom) o2).getName())<0){
			return -1;
		}else {
			return 0;
		}
	}

}

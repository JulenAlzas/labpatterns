package adapter;

import domain.Symptom;

public class Coparator2_bySeverityIndex implements java.util.Comparator{


	@Override
	public int compare(Object o1, Object o2) {

		if(((Symptom) o1).getSeverityIndex()>((Symptom) o2).getSeverityIndex()) {
			return 1;
		}else if(((Symptom) o1).getSeverityIndex()<((Symptom) o2).getSeverityIndex()){
			return -1;
		}else {
			return 0;
		}
	}
}

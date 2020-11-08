package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {
	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s5", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 9), 2);
		p.addSymptom(new Symptom("a3", 10, 6), 3);
		p.addSymptom(new Symptom("s4", 10, 7), 4);
		p.addSymptom(new Symptom("s1", 10, 8), 5);
		
		InvertedIterator it = new Iterator1(new ArrayList<Symptom>(p.getSymptoms()));
		Comparator comparator1= new Comparator1_bySymptonname();
		Comparator comparator2= new Coparator2_bySeverityIndex();
		
		System.out.println("Ordered by name:");
		Iterator sort1 = Sorting.sortedIterator(it, comparator1);
		while(sort1.hasNext())
			System.out.println(sort1.next());
		
		System.out.println("---------------------");
		System.out.println("Ordered by severityIndex:");
		Iterator sort2 = Sorting.sortedIterator(it, comparator2);
		while(sort2.hasNext())
			System.out.println(sort2.next());

	}
}

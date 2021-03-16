package quiz_03;

public class Student {

	String name;
	int rnr;
	int dud;
	int tn;
	
	void set(String n, int a, int b, int c) {
		name = n;
		rnr = a;
		dud = b;
		tn = c;
	}
	double getAverage() {
		double average = (rnr+dud+tn)/3;
		return average;
		
	}
	String getPass() {

		return getAverage() >= 60 ?"합격" : "불합격";
	}
}

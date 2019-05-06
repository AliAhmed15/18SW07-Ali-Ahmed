class Combine{
	Student s;
	Marksheet m;

	Combine(Student s, Marksheet m){
		this.s=s;
		this.m=m;
	}

	void printDetails(){
		s.showDetails();
		m.Totalmarks();
		m.Percentage();
		m.Grade();
	}
}
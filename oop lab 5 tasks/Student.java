class Student{
	String rollno;
	String name;
	String dept;
	int age;

	Student(){
	String rollno;
	String name;
	String dept;
	int age;
	
	}

	public void setDetails(String rollno,String name,String dept,int age){
	this.rollno=rollno;
	this.name=name;
	this.dept=dept;
	this.age=age;
	}

	public void showDetails(){
		System.out.println(rollno+"  "+name+"  "+dept+"  "+age);
	}
}
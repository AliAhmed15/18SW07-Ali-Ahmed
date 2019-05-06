class Dog{
	String name;
	String breed;
	int age;


	public void setDetails(String name, String breed,int age){
	this.name=name;
	this.breed=breed;
 	this.age=age;
            
	}
	public void setDetails(){
	System.out.println("detail is unavailable");
	}
	public void showDetails(){
	System.out.println(name+"	"+breed+"	"+age);
	}
	


}
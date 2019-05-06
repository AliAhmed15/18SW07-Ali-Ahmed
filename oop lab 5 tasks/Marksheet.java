class Marksheet{

	double java,dcld,laag,totalmarks,per;


	Marksheet(double java,double dcld,double laag){
		this.java=java;
		this.dcld=dcld;
		this.laag=laag;

	}

	public double Totalmarks(){
		totalmarks=java+dcld+laag;
		System.out.println(totalmarks);
		return totalmarks;

	}
	public double Percentage(){
		per=(totalmarks/300)*100;
		System.out.println(per);
		return per;

	}
	public void Grade(){
		if(per>90){
	   System.out.println("Grade:A*");
	 }
	 else if (per>80 && per<90){
	   System.out.println("Grade:A");}
	 else if(per>70 && per<80){
	   System.out.println("Grade:B");}
	 else if(per>60 && per<70){
	   System.out.println("Grade:C");

	  }
	   
	  else {
	   System.out.println("Grade:fail");
}
	}

}
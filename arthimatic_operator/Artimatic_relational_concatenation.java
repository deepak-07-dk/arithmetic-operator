package arthimatic_operator;

public class Artimatic_relational_concatenation {
	public void operator(){
		//arathimatic
		int num1=123;
		int num2=7;
		System.out.println("addition:"+(num1+num2));//addtion
		System.out.println("subration:"+(num1-num2));//subration
		System.out.println("multiplication:"+(num1*num2));//multiplication
		System.out.println("division:"+(num1/num2));//division
		System.out.println("modulus:"+(num1%num2));//modulus
			//relational
		int a=10,b=20,c=30,d=30;
		System.out.println("greater than:"+(b>a));//greater than
		System.out.println("less than:"+(b<a));//less than false
		System.out.println("greater equalto:"+(c>=d));//greater equalto
		System.out.println("less equalto:"+(a<=b));//less equalto 
		System.out.println("double equalto than:"+(c==d));//double equalto
		System.out.println("not equalto:"+(b!=a));//not equal to
		System.out.println("equal to(or)Assignment:"+(b=a));//Assignment
			//concatenation
		System.out.println("concatenation:"+123+7);
		}
	public static void main (String[]agra) {
		 //Artimatic_relational_concatenation.operator();
		 Artimatic_relational_concatenation obj=new Artimatic_relational_concatenation();
		 obj. operator(); 
		 //System.out.println("number:"+num2);
	}
}

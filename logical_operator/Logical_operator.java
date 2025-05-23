package logical_operator;

public class Logical_operator {
	
	public static void main (String[]agra) {
		        //logical operator
				int num1=10,num2=30,num3=-50,num4=60;
				//AND OPERATOR
				System.out.println("AND:"+(num1<num2));
				//OR OPERATOR
				System.out.println("OR:"+(num1 > num2 || num3 == num4));
				//NOT OR OPERATOR
				System.out.println("NOT OR:"+!(num1<num4));
				//Ternary OPERATOR
				System.out.println(  !(num1<=10-num2) ? (num1 + " is equal to " + num2) : 
					(num1+ " is not equal to "+num2)  );
				System.out.println("TERNARY:"+((num1 > num2) ? (num3 > num4) ? num1 : num3 :
					(num2 > num3) ? num2 : num4));				
	}

}

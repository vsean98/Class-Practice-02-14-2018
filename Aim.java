package sum;

public class Aim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=72;
		int b=6;
		int c=91;
		
		int e=averageNumbers(a,b,c);
		System.out.println("the average is"+ e);
System.out.println("The average is"+ averageNumbers(200,1,117));	
	}
		public static int averageNumbers(int num1,int num2,int num3) {
			
		int average=(num1+num2+num3)/3;
		
		return average;
	}

}

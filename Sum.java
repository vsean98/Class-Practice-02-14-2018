package sum;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=82;	
		int b= 64 ;	
		
		int c = compareNumbers(a,b);
		int e= 221 ;	
		int z=2;	
		int f = compareNumbers(z,e);
		int g=18;
		int h=31;
	System.out.println("The smallest is" + f);	
	
	System.out.println("The smallest is" + c);	
	System.out.println("The smallest is"+ g);
	}


	public static int compareNumbers(int num1,int num2) {
	
		if (num1<num2) {
			return num1;
		}else {
			return num2;
		
		}
		
	}

	
		
	public static int compareNumbers1(int num3,int num4) {
	
		if (num3>num4) {
			return num3;
		}else {
			return num4;
	
		}	
	}
	public static int compareNumbers2(int num5,int num6) {
		
		if (num5>num6) {
			return num5;
		}else {
			return num6;
	

}
}
	
		}
public class Main{
	public static void main(String[] args){
		int a;
		boolean verificareVar_a;

		a=20;
		a=++a + ++a + ++a + a-- -6;
		verificareVar_a=a > 5;
		System.out.println("1) a>5: "+verificareVar_a +"| a="+a);

		a=10;
		a=a++ + a + a-- + a-- + -- a + a++ - --a + a++ - a-- + a - --a + a++ + ++a ;
		verificareVar_a=a>5;
		System.out.println("2) a>5:"+ verificareVar_a +"| a="+a);

		
		a=10;
		a=a++ + a * a-- + a-- * -- a + a++ - --a * a++ - a-- + a - --a * a++ + ++a;
		verificareVar_a=a>5;
		System.out.println("3) a>5:" + verificareVar_a +"| a="+a);
		
		char varChar1='S';
		char varChar2=77;
		char varChar3='\u0064';
		System.out.println("Cele trei variabile char au valorile: "+ varChar1 + ' ' +varChar2+' '+varChar3 );

		int x;
		boolean verifXPresc;
		boolean verifXStd;
		x=-1;
		verifXPresc=x<100&&x++>=0;
		x=-1;
		verifXStd=x<100 & x++>0;
		System.out.println("1-a verificare (cu SI prescurtat): "+verifXPresc);
		System.out.println("2-a verificare (cu SI standard): "+verifXStd);
	}
}
import myfirstpackage.*;

class MyFirstClass {
	
	public static void main (String[] s) {
		
		MyFirstPackage o = new MyFirstPackage();
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				o.setField1(i);
				o.setField2(j);
				System.out.print(o.doBitwiseLeftShift());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
class MyFirstClass {
	
	public static void main (String[] s) {
		
		MySecondClass o = new MySecondClass();
		
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

class MySecondClass {
	
	private int field1, field2;
	
	public int getField1() {
		return field1;
	}
	public int getField2() {
		return field2;
	}
	public void setField1(int setValue) {
		field1 = setValue;
	}
	public void setField2(int setValue) {
		field2 = setValue;
	}
	
	public MySecondClass() {
		this.field1 = 1;
		this.field2 = 2;
	}
	
	public int doBitwiseLeftShift() {
		return field1 << field2;
	}
}
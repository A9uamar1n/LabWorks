package myfirstpackage;

public class MyFirstPackage {
	
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
	
	public MyFirstPackage() {
		this.field1 = 1;
		this.field2 = 2;
	}
	
	public int doBitwiseLeftShift() {
		return field1 << field2;
	}
}
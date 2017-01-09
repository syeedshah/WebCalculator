package webcalculator.form;


//import webcalculator.domain.Numbers;

public class Calculator {
	
	
	private int A;
	private int B;
	private int sum;
	private String key = "arsger6546Erfgdega6876srgFEFGE687srwfg";
	
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	
	
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	
	
	public int getAdd(){
		sum = A+B;
		return sum;
	}
	
	public int getSubtract(){
		sum = A-B;
		return sum;
	}
	

}

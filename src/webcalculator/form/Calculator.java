package webcalculator.form;


//import webcalculator.domain.Numbers;

public class Calculator {
	
	
	private int A;
	private int B;
	private int sum;
	private String SecretKey = "";
	private String AccessId = "";
	private String AwsSecretKey = "";
	private String AndrewBarkeysPassword = "";
	
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

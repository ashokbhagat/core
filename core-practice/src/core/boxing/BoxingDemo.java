package core.boxing;

public class BoxingDemo {
	public static void main(String[] args) {
		BoxingDemo boxing = new BoxingDemo();
		boxing.multi(214748364);
		boxing.multi(10.0f);
		boxing.multi(Integer.valueOf(10));
		
	}	
	
	public void multi(int number) {
		System.out.println("inside int");
	 }
	
	public void multi(Integer number) {
		System.out.println("inside Integer");
	 }
	
	public void multi(float number) {
		System.out.println("inside float");
	 }
	
	public void multi(Float number) {
		System.out.println("inside Float");
	 }
	
	public void multi(double number) {
		System.out.println("inside double");
	 }
	
	public void multi(Double number) {
		System.out.println("inside double");
	 }
	
	
}

package reflect;

public class D {
	
	@RequestMapping("GD")
	public void m1() {
		System.out.println("D的m1方法");
	}
	
	@RequestMapping("TOP")
	public String m2() {
		System.out.println("D的m2方法");
		return "I am m2";
	}
	
	public void foo() {
		System.out.println("D的foo方法");
	}
	
}

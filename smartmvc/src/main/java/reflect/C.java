package reflect;

public class C {
	
	@Test("haha")
	public void m1() {
		System.out.println("C的m1方法");
	}
	
	@Test("hehe")
	public String m2() {
		System.out.println("C的m2方法");
		return "I am m2";
	}
	
	public void foo() {
		System.out.println("C的foo方法");
	}
}

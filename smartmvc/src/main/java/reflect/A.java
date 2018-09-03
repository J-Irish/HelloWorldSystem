package reflect;

public class A {
	public void f1() {
		System.out.println("A的f1方法");
	}
	
	public String f2() {
		System.out.println("A的f2方法");
		return "I am f2";
	}
	
	public void foo(String msg) {
		System.out.println("A的foo方法"+msg);
	}
	
}

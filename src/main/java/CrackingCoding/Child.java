package CrackingCoding;

public class Child extends Parent {
	public void m2() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c1 = new Child();
		c1.m1();
		c1.m2();
		Parent p1 = new Child();
		p1.m1();
		//Child c2 = new Parent();
		
	}
}

package pack1;

import pack2.B;

public class A {
	
	public void method() {
		System.out.println("A-method ½ÇÇà");
		
		B b = new B();
		b.method();
	}
	
	public C get C() {
		C c = new C();
		return C;
	}
}

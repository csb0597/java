package app;

import pack1.A;
// import pack2.A;
import pack3.C;

public class Main {
	
	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		// B b = new B();
		// b.method();
		
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
	}
}

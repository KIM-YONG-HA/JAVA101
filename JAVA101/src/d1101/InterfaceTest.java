package d1101;

public class InterfaceTest implements InterfaceC {
	
	@Override
	public void methodA() {
		System.out.println("methodA");
		
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
		
	}

	@Override
	public void methodC() {
		System.out.println("methodC");
		
	}
	

	public static void main(String[] args) {
		
		InterfaceTest imp = new InterfaceTest();
		
		InterfaceA ia = imp;
		ia.methodA();
		System.out.println("----");
		
		
		InterfaceB ib = imp;
		ib.methodB();
		System.out.println("----");
		
		
		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println("----");
		
		

	}
	
	
	

}


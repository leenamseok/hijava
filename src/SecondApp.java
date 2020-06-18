class B extends Thread {
	public void run() {
		System.out.println("B thread!!");
	}
}

class C implements Runnable {
	public void run() {
		System.out.println("Cthread!!");
	}
}
public class SecondApp {
	public static void main(String[] ar) {
		B bp = new B();
		C cp = new C();
		bp.start();
		new Thread(cp).start();
		
		System.out.println("Main!!");
		
	}
}

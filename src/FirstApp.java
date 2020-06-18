
class A {
	static {
		System.out.println("Static!!");
	}
}

public class FirstApp extends A {

	public static void main(String[] ar) {
		System.out.println("Main!!");
		System.out.println("Git Test");
	}

	public void finalize() {
		System.out.println("End");
	}

}


class A {
	static {
		System.out.println("Static!!");
	}
}

public class FirstApp extends A {

	public static void main(String[] ar) {
		System.out.println("Main!!");
		System.out.println("Git Test");
		System.out.println("Git Author / committer Test user <user@LAPTOP-F3US3O49>");
		System.out.println("Git 한글 테스트입니다-깃허브에 push합니다.");
	}

	public void finalize() {
		System.out.println("End");
	}

}

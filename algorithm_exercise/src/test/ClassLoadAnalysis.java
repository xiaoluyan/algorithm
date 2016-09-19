package test;

class SSClass {
	static {
		System.out.println("SSClass");
	}
}

class SuperClass extends SSClass {
	static {
		System.out.println("SuperClass init!");
	}

	public static int value = 123;

	public SuperClass() {
		System.out.println("init SuperClass");
	}
}

class SubClass extends SuperClass {
	static {
		System.out.println("SubClass init");
	}

	static int a;

	public SubClass() {
		System.out.println("init SubClass");
	}
}

public class ClassLoadAnalysis {
	// public static void main(String[] args) {
	// System.out.println(SubClass.value);
	// }

	public static void main(String[] args) {
		staticFunction();
	}

	static ClassLoadAnalysis st = new ClassLoadAnalysis();

	static {
		System.out.println("1");
	}

	{
		System.out.println("2");
	}

	ClassLoadAnalysis() {
		System.out.println("3");
		System.out.println("a=" + a + ",b=" + b);
	}

	public static void staticFunction() {
		System.out.println("4");
	}

	int a = 110;
	static int b = 112;
}

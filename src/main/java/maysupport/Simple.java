package maysupport;

public class Simple {

	public static void main(String[] args) {
		System.out.println("Hello World::");
		Calculator cal = new Calculator();
		int result = cal.add(10, 20);
		System.out.println("result is :"+ result);
	}

}

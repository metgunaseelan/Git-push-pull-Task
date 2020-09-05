package org.tcs;

public class ProjectA {

	private void m1() {
		System.out.println("Method 1");
	}
	private void m2() {
		System.out.println("Method 2");
	}
	private void m3() {
		System.out.println("Method 3");
	}
	private void m4() {
		System.out.println("Method 4");

	}
	private ProjectA() {
		System.out.println("Default constructor");
	}
	private ProjectA(int a) {
		System.out.println("Parameterised Constructor");
	}
	public static void main(String[] args) {
	ProjectA p = new ProjectA();

	p.m1();
	p.m2();

	}
}

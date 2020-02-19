package com.git.example.tests;

public class Test01 {

	private String message;

	public Test01() {
		this.message = "";
	}

	public Test01(String message) {
		this.message = message;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}

	// fonction qui affiche un message en console
	private void print(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {

		Test01 test = new Test01("Bonjour les amis!");
		test.print(test.getMessage());

		test.print("Test new project modified 2 by gcb");
	}
}

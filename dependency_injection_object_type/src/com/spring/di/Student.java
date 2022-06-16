package com.spring.di;

public class Student {

	// MathCheat mathCheat = new MathCheat(); ----Avoid using new keyword.

	// MathCheat mathCheat = new MathCheat(); //from different class we should
	// inject this new MathCheat() to this particular reference

	private int id;
	private MathCheat mathCheat;

	public void setId(int id) {
		this.id = id;
	}

	// setter injection
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {

		mathCheat.mathCheat();
		System.out.println("Hey my id is " + id + " take and do whatever you want to do....");
	}

}

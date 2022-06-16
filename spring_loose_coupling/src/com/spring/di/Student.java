package com.spring.di;

public class Student {
	
	//private MathCheat mathCheat;
	//private ScienceCheat cheat;
	
	private Cheat cheat;
	
//	public void setCheat(ScienceCheat cheat) {
//		this.cheat = cheat;
//	}
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		//cheat.scienceCheat();
		cheat.cheat();
	}

}

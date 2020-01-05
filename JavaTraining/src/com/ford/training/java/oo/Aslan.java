package com.ford.training.java.oo;

public class Aslan extends Kedi {
	
	@Override
	public String sesCikar() {
		String ses = super.sesCikar();
		return "Moooooor " + ses;
	}
	
}

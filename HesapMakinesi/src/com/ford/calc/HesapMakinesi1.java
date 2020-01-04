package com.ford.calc;

public class HesapMakinesi1 {
	private int deger1;
	private int deger2;

	public int topla() {
		return deger1 + deger2;
	}

	public int cikar() {
		return deger1 - deger2;
	}

	public int carp() {
		return deger1 * deger2;
	}

	public int bol() {
		if (deger2 == 0) {
			return 0;
		}
		return deger1 / deger2;
	}

	public int getDeger1() {
		return deger1;
	}

	public void setDeger1(int deger1) {
		if (deger1 < 0) {
			deger1 = 0;
		} else {
			this.deger1 = deger1;
		}
	}

	public int getDeger2() {
		return deger2;
	}

	public void setDeger2(int deger2) {
		this.deger2 = deger2;
	}

}

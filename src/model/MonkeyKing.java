package model;

import java.util.*;

public class MonkeyKing extends Hero {
	public MonkeyKing() {
		super();
	}
	
	public MonkeyKing(String name, int attack, int life) {
		super(name, attack, life);
	}
	
	public void jinDouYun() {
		System.out.println("Jin Dou Yun! MonkeyKing");
	}
	
	public void siventyAndTwoChange() {
		System.out.println("��!");
	}
	
	public void fight(){
		System.out.println("fight");
	}
}

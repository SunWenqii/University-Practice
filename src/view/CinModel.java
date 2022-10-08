package view;

import model.*;

import java.util.*;

public class CinModel {
	public Hero creatHero() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入姓名：");
		String name = sc.nextLine();
		System.out.print("请输入攻击值：");
		int attack = sc.nextInt();
		System.out.print("请输入生命值：");
		int life = sc.nextInt();
		
		Hero h = new Hero(name, attack, life);
		return h;

	}
	
	public MonkeyKing creatMonkey() {
			MonkeyKing mk = new MonkeyKing("孙悟空", 100, 1000);
			return mk;
		}
}

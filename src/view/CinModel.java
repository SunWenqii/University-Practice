package view;

import model.*;

import java.util.*;

public class CinModel {
	public Hero creatHero() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������������");
		String name = sc.nextLine();
		System.out.print("�����빥��ֵ��");
		int attack = sc.nextInt();
		System.out.print("����������ֵ��");
		int life = sc.nextInt();
		
		Hero h = new Hero(name, attack, life);
		return h;

	}
	
	public MonkeyKing creatMonkey() {
			MonkeyKing mk = new MonkeyKing("�����", 100, 1000);
			return mk;
		}
}

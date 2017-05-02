package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//POM错误会影响执行
public class KnightMain {
//	public static void main(String[] args){
//		Quest quest = new MakeRoundTableRounderQuest();
//		BraveKnight braveKnight = new BraveKnight(quest);
//		braveKnight.embarkOnQuest();
//		
//		
//		DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight();
//		damselRescuingKnight.embarkOnQuest();
//	}
	
	
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = (Knight) ctx.getBean("knight");
		knight.embarkOnQuest();
	}
}

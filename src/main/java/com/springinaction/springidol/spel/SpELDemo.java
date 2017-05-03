package com.springinaction.springidol.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

public class SpELDemo {
	private int count;
	
	private boolean isLargeCircle;
	
	private String song;
	
	private String bakSong;
	
	private double circumference;
	
	private double perimeter;
	
	private double randomNum;
	
	private double radius;
	
	private double area;
	
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getBakSong() {
		return bakSong;
	}

	public void setBakSong(String bakSong) {
		this.bakSong = bakSong;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(double randomNum) {
		this.randomNum = randomNum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isLargeCircle() {
		return isLargeCircle;
	}

	public void setLargeCircle(boolean isLargeCircle) {
		this.isLargeCircle = isLargeCircle;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	@Override
	public String toString() {
		return "SpELDemo [count=" + count + ", isLargeCircle=" + isLargeCircle + ", song=" + song + ", bakSong="
				+ bakSong + ", circumference=" + circumference + ", perimeter=" + perimeter + ", randomNum=" + randomNum
				+ ", radius=" + radius + ", area=" + area + "]";
	}

	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("p-spel.xml");
		SpELDemo demoBean = (SpELDemo) ctx.getBean("spELDemo");
		System.out.println(demoBean);
		
		Performer hank = (Performer) ctx.getBean("hank");
		try {
			hank.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

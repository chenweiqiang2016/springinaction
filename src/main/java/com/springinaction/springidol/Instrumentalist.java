package com.springinaction.springidol;

public class Instrumentalist implements Performer{
	
	public Instrumentalist(){}

	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + ": ");
		instrument.play();
	}
	
	String song;
	
	public void setSong(String song){
		this.song=song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	Instrument instrument;
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}
	
	//get方法不是必须的
	
	int age;
	
	public void setAge(int age){
		this.age =age;
	}
	
	public int getAge(){
		return age;
	}
}

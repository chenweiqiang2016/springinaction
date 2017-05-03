package com.springinaction.springidol.spel;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

public class SpELPerformer implements Performer{
	
	private String song;
	

	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
	}

}

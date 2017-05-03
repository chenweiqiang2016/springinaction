package com.springinaction.springidol.spel;

import java.util.Collection;
import java.util.Properties;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

public class OneManBand implements Performer{
	
	Collection<Instrument> instruments;
	//<list>和<set>基本可以互换使用
	//数组类型也是可以的 Instrument[]也是可以的 Collection的实现也是可以的
	
	Properties songs;
	
	public Properties getSongs() {
		return songs;
	}

	public void setSongs(Properties songs) {
		this.songs = songs;
	}

	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public void perform() throws PerformanceException {
		for(Instrument instrument:instruments){
			instrument.play();
		}
		for(Object key:songs.keySet()){
			System.out.println(key + ": " + songs.getProperty((String)key));
		}
	}
	
	
}

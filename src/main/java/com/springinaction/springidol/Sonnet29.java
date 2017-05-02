package com.springinaction.springidol;

public class Sonnet29 implements Poem{
	
	//使用static修饰 lines
	private static String[] LINES = {
			"When, in disgrace with fortune and men's eyes, ",
			"I all alone beweep my outcast state ",
			"And look upon myself and curse my fate, "
	};

	public void recite() {
		for(int i=0; i<LINES.length; i++){
			System.out.print(LINES[i]);
		}
	}

}

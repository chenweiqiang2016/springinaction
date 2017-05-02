package com.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class BraveKnightTest {
    @Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class); //创建一个实现
		
		BraveKnight knight = new BraveKnight(mockQuest);
		
		knight.embarkOnQuest();
		
		verify(mockQuest, times(1)).embark(); //测试Quest的方法被调用一次
		
	}
}

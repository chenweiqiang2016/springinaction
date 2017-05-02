package com.springinaction.knights;

public class BraveKnight implements Knight{
	Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}

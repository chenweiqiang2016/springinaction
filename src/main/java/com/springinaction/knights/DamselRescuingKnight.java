package com.springinaction.knights;

public class DamselRescuingKnight {
	RescueDamselQuest quest;
	
	public DamselRescuingKnight(){
		quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}

}

package com.springinaction.springidol;

//单例类
//https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
public class Stage {
	private Stage() {
	}

	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}

}

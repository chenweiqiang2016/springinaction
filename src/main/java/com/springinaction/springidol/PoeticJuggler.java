package com.springinaction.springidol;

//使用了继承
public class PoeticJuggler extends Juggler{
	Poem poem;
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException{
		super.perform(); //调用父类的方法
		System.out.println("While reciting...");
		poem.recite();
	}

}

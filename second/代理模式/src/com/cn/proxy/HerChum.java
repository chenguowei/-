package com.cn.proxy;

public class HerChum implements GiveGril{
	Me me;
	
	public HerChum(BeautifulGirl mm){
		me = new Me(mm);
	}
	public void giveFlower() {
		me.giveFlower();
	}

	public void giveChololate() {
		me.giveChololate();
	}

	public void giveBook() {
		me.giveBook();
	}

}

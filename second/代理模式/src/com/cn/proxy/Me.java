package com.cn.proxy;

public class Me implements GiveGril {
	BeautifulGirl mm;
	
	public Me(BeautifulGirl mm){
		this.mm = mm;
	}

	public void giveFlower() {
		System.out.println(mm.getName()+"...送你花");
		
	}

	public void giveChololate() {
		System.out.println(mm.getName()+ "...送你巧克力");
	}

	public void giveBook() {
		System.out.println(mm.getName()+ "...送你书");
	}
	

	
}

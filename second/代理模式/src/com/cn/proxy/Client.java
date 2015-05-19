package com.cn.proxy;

public class Client {

	public static void main(String[] args) {
		BeautifulGirl mm = new BeautifulGirl("嗨，美女");
		
		/*
		 * 送美女的舍友当代理人，代替我去送花，送巧克力，送书
		 */
		HerChum hc = new HerChum(mm);
		hc.giveFlower();
		hc.giveChololate();
		hc.giveBook();
	}

}

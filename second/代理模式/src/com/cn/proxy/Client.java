package com.cn.proxy;

public class Client {

	public static void main(String[] args) {
		BeautifulGirl mm = new BeautifulGirl("�ˣ���Ů");
		
		/*
		 * ����Ů�����ѵ������ˣ�������ȥ�ͻ������ɿ���������
		 */
		HerChum hc = new HerChum(mm);
		hc.giveFlower();
		hc.giveChololate();
		hc.giveBook();
	}

}

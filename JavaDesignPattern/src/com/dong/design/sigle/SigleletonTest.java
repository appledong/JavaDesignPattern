package com.dong.design.sigle;

import com.dong.design.sigle.Sigleleton;

public class SigleletonTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	System.out.println("普通单例的测试");
		Sigleleton sigleleton = Sigleleton.getInstance5();
		System.out.println("主线程里的对象：" + sigleleton);
		new Thread(new Runnable() {

			@Override
			public void run() {
				Sigleleton sigleleton = Sigleleton.getInstance5();
				System.out.println("主线程里的对象：" + sigleleton);
			}
		}).start();
    	System.out.println("枚举单例的测试");
        System.out.println("主线程里的对象：" + Siglegon2.Instanse.person);
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("主线程里的对象：" + Siglegon2.Instanse.person);
            }
        }).start();
    }

}

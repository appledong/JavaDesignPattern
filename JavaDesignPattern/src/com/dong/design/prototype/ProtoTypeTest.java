package com.dong.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeTest {

	public static void main(String[] args) {
//		 User user = new User();
//		 user.setName("mary");
//		 user.setAge(18);
//		 System.out.println("user是：" + user.toString());
//		// try {
//		// User user2 = (User) user.clone();
//		// user2.setAge(20);
//		// user2.setName("lily");
//		// System.out.println("user2：" + user2.toString());
//		// System.out.println("User:" + user.toString());
//		// } catch (CloneNotSupportedException e) {
//		// // TODO Auto-generated catch block
//		// e.printStackTrace();
//		// }
//		UserInfo userInfo = new UserInfo();
//		userInfo.setSex(0);
//		userInfo.setUser(user);
//		System.out.println("UserInfo：" + userInfo.toString());
//		try {
//			UserInfo userInfo2 = (UserInfo) userInfo.clone();
//			userInfo2.setSex(1);
//			User user2 = new User();
//			user2.setName("xiaoming");
//			user2.setAge(19);
//			userInfo2.setUser(user2);
//			userInfo2.setBooks("语文");
//			userInfo2.setBooks("数学");
//			System.out.println("userinfo2:" + userInfo2.toString());
//			System.out.println("userinfo：" + userInfo.toString());
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		WorkDocument workDocument = new WorkDocument();
		workDocument.setDocument("这是一篇文章");
		workDocument.addImage("image1");
		workDocument.addImage("image2");
		workDocument.addImage("image3");
		System.out.println(workDocument.toString());
		try {
			WorkDocument workDocument2 = workDocument.clone();
			workDocument2.setDocument("修改了这篇文章");
			workDocument2.addImage("哈哈.jpg");
			System.out.println(workDocument2.toString());
			System.out.println(workDocument.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

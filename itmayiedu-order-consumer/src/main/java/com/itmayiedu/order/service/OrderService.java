package com.itmayiedu.order.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itmayiedu.member.service.UserService;

public class OrderService {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		System.out.println("�������������ɹ�..");
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println("����������û�Ա����ʼ...");
		String result = userService.getUser(1l);
		System.out.println("����������û�Ա�������...result:"+result);
		
	}
	

}

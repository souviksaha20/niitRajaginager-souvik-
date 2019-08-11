package com.niit.infatuation;

	import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.infatuation.dao.UserDao;
import com.niit.infatuation.model.Authentication;
import com.niit.infatuation.model.User;
	public class CartItemTest {
		public static void main(String a[])
		{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		User user=(User)context.getBean("user");
		UserDao userDao=(UserDao)context.getBean("userDao");
		user.setUser_customer("asdfasfd");
		Authentication authentication=new Authentication();
		user.setAuthentication(authentication);
		userDao.saveorupdate(user);
		 
		
	   }
	}



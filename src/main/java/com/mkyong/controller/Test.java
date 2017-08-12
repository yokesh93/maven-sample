package com.mkyong.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mkyong.configure.VersionConfigure;
import com.mkyong.domain.VersionBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(VersionConfigure.class);
		VersionBean versionBean =(VersionBean)context.getBean("versionBean");
		System.out.println(versionBean.toString());

	}

}

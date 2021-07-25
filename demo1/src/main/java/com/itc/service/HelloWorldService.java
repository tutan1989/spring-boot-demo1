package com.itc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements HelloWorld{

	@Override
	public String sayHello(String msg) {
		System.out.println("Hello "+msg);
		return "Hello "+msg;
	}

}

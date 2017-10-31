package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.CacheAdvice;
import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new CacheAdvice());
		pf.addAdvice(new LoggingAdvice());

		Calculator proxy = (Calculator) pf.getProxy();
		// Calculator proxy = new Calculator();
		int res = proxy.add(10, 20);
		res = proxy.add(10, 20);
		// int res = proxy.substract(20, 10);
		// int res = proxy.multiply(10, 5);
		System.out.println("Result = " + res);
	}
}

package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.util.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;
		Cache cache = null;
		cache = cache.getInstance();

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		// build the key
		// add(10,20)
		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key = key + args[i];
				continue;
			}
			key = key + "," + args[i];
		}
		key = key + ")";
		// System.out.println("Key: "+key);
		if (cache.containsKey(key) == true) {
			// If data is there inside the cache don't execute target classs
			// method rather return the value from cache
			return cache.get(key);
		}

		// data is not found in the cache so execute target class method
		Object ret = methodInvocation.proceed();
		cache.put(key, ret);

		return ret;
	}

}

package com.egoo.app1.module.action;

import com.alibaba.citrus.turbine.Context;

public class LoginAction {

	public boolean execute(Context context) {
		context.put("name", "loginName");
		return false;
	}
	
}

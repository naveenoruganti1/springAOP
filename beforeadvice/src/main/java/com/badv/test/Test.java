package com.badv.test;

import org.springframework.aop.framework.ProxyFactory;

import com.badv.beans.AuditAdvice;
import com.badv.beans.LoanManger;

public class Test {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new LoanManger());
		factory.addAdvice(new AuditAdvice());
		
		LoanManger loanManger = (LoanManger) factory.getProxy();
		loanManger.approveLoan(10241);
	}

}

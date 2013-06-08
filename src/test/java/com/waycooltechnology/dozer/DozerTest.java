package com.waycooltechnology.dozer;

import junit.framework.Assert;

import org.junit.Test;

import com.waycooltechnology.dozer.DozerUtil;
import com.waycooltechnology.dozer.domain.ClassA;
import com.waycooltechnology.dozer.domain.ClassA1;
import com.waycooltechnology.dozer.domain.ClassB;

public class DozerTest {

	@Test
	public void dozerTest(){
		ClassA a = new ClassA();
		a.setStringField("aaa");
		a.setBooleanField(false);
		a.setLongField(100L);
		ClassA1 classA1 = new ClassA1();
		classA1.setStringField1("A1");
		classA1.setBooleanField1(true);
		classA1.setLongField1(10000L);
		
		a.setClassA1(classA1);
		ClassB b = DozerUtil.mapper(a);
		
		Assert.assertEquals(a.getStringField(), b.getStringField());
		System.out.println(a);
		System.out.println(b);
		Assert.assertEquals(a.isBooleanField(), b.isBooleanField());
		Assert.assertEquals(a.getLongField(), b.getLongField());
	}
}

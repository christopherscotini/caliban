package com.gamaset.caliban.vo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ErrorVOTest {
	
	@Test
	public void checkImmutableSucess(){
		
		ErrorVO vo = new ErrorVO(400, "verify anything. :(", Arrays.asList("error1"));
		
		Assert.assertEquals(new Integer(400), vo.getCode());
		Assert.assertEquals("verify anything. :(", vo.getMessage());
		vo.getErrors().forEach(e -> {
			Assert.assertEquals("error1", e);
		});
		
	}

}

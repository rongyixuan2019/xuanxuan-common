/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: xuanxuan-common
 * @Package: com.xuanxuan.common 
 * @Description: TODO
 * @author: 86155   
 * @date: 2019年11月17日 下午7:35:03 
 * @version: V1.0   
 */
package com.xuanxuan.common;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 86155
 * @date: 2019年11月17日 下午7:35:03  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.xuanxuan.common.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		RandomUtil.random(1, 7);
		System.out.println(RandomUtil.random(1, 7));
	}

	/**
	 * Test method for {@link com.xuanxuan.common.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.xuanxuan.common.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.xuanxuan.common.RandomUtil#randomNumber(int)}.
	 */
	@Test
	public void testRandomNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.xuanxuan.common.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		fail("Not yet implemented");
	}

}

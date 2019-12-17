/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PhoneAndEmail.java 
 * @Prject: xuanxuan-common
 * @Package: com.xuanxuan.common 
 * @Description: TODO
 * @author: 86155   
 * @date: 2019年11月17日 下午7:48:23 
 * @version: V1.0   
 */
package com.xuanxuan.common;

import java.util.regex.Pattern;

/** 
 * @ClassName: PhoneAndEmail 
 * @Description: TODO
 * @author: 86155
 * @date: 2019年11月17日 下午7:48:23  
 */
public class PhoneAndEmail {
	//判断手机号
		public static boolean checkMobile(String mobile) {
		    String regex = "(\\+\\d+)?1[3458]\\d{9}$";
		    return Pattern.matches(regex,mobile);
		}
		//判断邮箱
		 public static boolean checkEmail(String email) {
		        String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		        return Pattern.matches(check,email);    
		    }
}

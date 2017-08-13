package com.cyb.base64;

import java.io.IOException;
import java.lang.reflect.Method;
/**
 * 
 * 作者 : iechenyb<br>
 * 方法描述: 说点啥<br>
 * 创建时间: 2017年7月15日hj12
 */
public class Base64Utils {
	/***
	 * encode by Base64
	 */
	public static String encodeBase64(byte[] input) throws Exception {
		Class<?> clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
		Method mainMethod = clazz.getMethod("encode", byte[].class);
		mainMethod.setAccessible(true);
		Object retObj = mainMethod.invoke(null, new Object[] { input });
		return (String) retObj;
	}

	/***
	 * decode by Base64
	 */
	public static byte[] decodeBase64(String input) throws Exception {
		Class<?> clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
		Method mainMethod = clazz.getMethod("decode", String.class);
		mainMethod.setAccessible(true);
		Object retObj = mainMethod.invoke(null, input);
		return (byte[]) retObj;
	}

	/**
	 * 编码
	 * 
	 * @param bstr
	 * @return String
	 */
	@SuppressWarnings("restriction")
	public static String encode(byte[] bstr) {
		return new sun.misc.BASE64Encoder().encode(bstr);
	}

	/**
	 * 解码
	 * 
	 * @param str
	 * @return string
	 */
	@SuppressWarnings("restriction")
	public static byte[] decode(String str) {
		byte[] bt = null;
		try {
			sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
			bt = decoder.decodeBuffer(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bt;
	}

	public static void main(String[] args) throws Exception {
		String str = "client:m_volunteer";
		String target = "Y2xpZW50Om1fdm9sdW50ZWVy";
		System.out.println(new String(encodeBase64(str.getBytes())).equals(target));
		System.out.println(new String(decodeBase64(target)));
		System.out.println(new String(encode(str.getBytes())).equals(target));
		System.out.println(new String(decode(target)));
	}
}

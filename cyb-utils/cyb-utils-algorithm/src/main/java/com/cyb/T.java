package com.cyb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年8月13日
 */
public class T {
	Log log = LogFactory.getLog(T.class);
	public static void main(String[] args) {
		System.out.println("dd");
		List lst = new ArrayList();
		StringBuffer sb =new StringBuffer("0123456789");
		sb.insert(2, "xdd");
		System.out.println(sb.toString());
	}
}

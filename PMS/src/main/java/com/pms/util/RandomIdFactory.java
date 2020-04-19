package com.pms.util;

import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;
public class RandomIdFactory {
	private static final long WorkLogLength = 7;
	/**
	 * @return 当前时间如20191223
	 */
	public static String nowDate() {
		SimpleDateFormat time= new SimpleDateFormat("yyyyMMdd");
    	Date date = new Date();//创建一个date对象保存当前时间
        String nowtime = time.format(date);
        return nowtime;
	}
	/**
	* @author:  ljx
	* @methodsName: getWorkLogId
	* @description: 返回某一页的工作日志
	* @param:   
	* @return: String
	* @Time:   2020-4-19 20:10
	* @throws: 
	*/
	public static String getWorkLogId() {
		long min = 1,max = 9;
		for (int i = 1; i < WorkLogLength; i++) {
			min *= 10;
			max *= 10;
		}
		long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
		return nowDate()+String.valueOf(rangeLong);
	}
}

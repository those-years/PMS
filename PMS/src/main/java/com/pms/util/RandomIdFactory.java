package com.pms.util;

import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;
public class RandomIdFactory {
	private static final long WorkLogLength = 7;
	/**
	 * @return ��ǰʱ����20191223
	 */
	public static String nowDate() {
		SimpleDateFormat time= new SimpleDateFormat("yyyyMMdd");
    	Date date = new Date();//����һ��date���󱣴浱ǰʱ��
        String nowtime = time.format(date);
        return nowtime;
	}
	/**
	* @author:  ljx
	* @methodsName: getWorkLogId
	* @description: ����ĳһҳ�Ĺ�����־
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

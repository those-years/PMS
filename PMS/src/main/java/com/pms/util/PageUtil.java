package com.pms.util;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
public class PageUtil {
	public static JSONArray createPage(List<Object> lists,String pageNunmber, String pageSize){
		List<Object> page = new ArrayList<Object>();
		int minflag = (Integer.parseInt(pageNunmber)-1)*Integer.parseInt(pageSize)-1;
		int maxflag = Integer.parseInt(pageNunmber)*Integer.parseInt(pageSize)-1;
		Object obj = new Object();
		for(int i=0;i<lists.size();i++) {
			if(i>minflag&&i<=maxflag) {	
				obj = lists.get(i);
				page.add(obj);
			}
		}
		JSONArray jsb = JSONArray.fromObject(page);
		return jsb;
	}
}

package com.pms.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
public class JsonUtil {
	public static void returnJson(JSONArray jsonArray,HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("{\"flag\":true,\n\"data\":[");
			if(jsonArray!=null) {
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject object = (JSONObject) jsonArray.get(i); // 将array中的数据进行逐条转换
					//out.println(object+",");
					if(i < jsonArray.size()-1) {
						out.println(object+",");
					}
					
					if(i+1==jsonArray.size()) {
						out.println(object);
						out.println("]}");
						return;
					}
				}
			}else {
				out.println("]}");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

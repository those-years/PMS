package com.pms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.service.WorkLogService;
import com.pms.service.serviceimpl.WorkLogServiceImpl;
import com.pms.util.JsonUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
public class WorkLogController extends HttpServlet{
	private WorkLogService workLogServiceimpl = new WorkLogServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		if(requestURI.equals("/PMS/WorkLog/getWorkLogById")) {
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(), request, response);
		}else if(requestURI.equals("/PMS/WorkLog/getAllWorkLog")) {
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(), request, response);
		}else if(requestURI.equals("/PMS/WorkLog/delWorkLogById")) {
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(), request, response);
		}else if(requestURI.equals("/PMS/WorkLog/updateWorkLog")) {
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(), request, response);
		}else if(requestURI.equals("/PMS/WorkLog/addWorkLog")) {
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(), request, response);
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}

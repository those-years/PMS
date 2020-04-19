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
			//http://localhost:8080/PMS/WorkLog/getWorkLogById?workLogId=1
			String workLogId = request.getParameter("workLogId");
			JsonUtil.returnJson(workLogServiceimpl.findWorkLogById(workLogId), request, response);
		}else if(requestURI.equals("/PMS/WorkLog/getAllWorkLog")) {
			
		}else if(requestURI.equals("/PMS/WorkLog/delWorkLogById")) {
			
		}else if(requestURI.equals("/PMS/WorkLog/updateWorkLog")) {
			
		}else if(requestURI.equals("/PMS/WorkLog/getWorkLogPage")) {
			//http://localhost:8080/PMS/WorkLog/getWorkLogPage?pageNunmber=1&pageSize=3
			String pageNunmber = request.getParameter("pageNunmber");
			String pageSize = request.getParameter("pageSize");
			JsonUtil.returnJson(workLogServiceimpl.getWorkLogPage(pageNunmber,pageSize), request, response);
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}

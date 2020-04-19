package com.pms.service.serviceimpl;

import java.util.*;

import org.junit.Test;

import com.pms.dao.WorkLogMapper;
import com.pms.entity.WorkLog;
import com.pms.service.WorkLogService;
import com.pms.util.*;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WorkLogServiceImpl implements WorkLogService {
	private WorkLogMapper workLogMapper=MapperUtil.getSqlSession().getMapper(WorkLogMapper.class);
	/**
	* @author:  ljx
	* @methodsName: findWorkLogById
	* @description: 返回某一页的工作日志
	* @param:  String workLogId
	* @return: JSONArray
	* @Time:   2020-4-19 15:02:29
	* @throws: 
	*/
	@Override
	public JSONArray findWorkLogById(String workLogId) {
		JSONArray jsb;
		WorkLog workLog;
		workLog = workLogMapper.getWorkLogById(workLogId);
		if(workLog!=null) {
			jsb = JSONArray.fromObject(workLog);
			return jsb;
		}
		return null;
	}

	
	@Test
	public void testGetPage() {
		System.out.println(getWorkLogPage("1","3"));
	}
	/**
	* @author:  ljx
	* @methodsName: getAllWorkLog
	* @description: 返回某一页的工作日志
	* @param:  String pageNunmber, String pageSize
	* @return: String
	* @Time:   2020-4-19 15:02:29
	* @throws: 
	*/
	@Override
	public JSONArray getWorkLogPage(String pageNunmber, String pageSize) {
		List<WorkLog> workLogs = workLogMapper.getAllWorkLog();
		List<Object> lists = new ArrayList<>();
		for(WorkLog workLog : workLogs) {
			lists.add(workLog);
		}
		JSONArray jsb = PageUtil.createPage(lists,pageNunmber,pageSize);
		return jsb;
	}
	@Test
	public void testaddWorkLog() {
		WorkLog workLog = new WorkLog(null, "1", "1", "1", "1");
		addWorkLog(workLog);
	}
	/**
	* @author:  ljx
	* @methodsName: addWorkLog
	* @description: 增加工作日志
	* @param:  WorkLog workLog
	* @return: JSONArray
	* @Time:   2020-4-19 15:10:11
	* @throws: 
	*/
	@Override
	public JSONArray addWorkLog(WorkLog workLog) {
		//创建日志id
		String workLogId = RandomIdFactory.getWorkLogId();
		//创建的日志id存在时重新创建
		while(workLogMapper.getWorkLogById(workLogId)!=null) {
			workLogId = RandomIdFactory.getWorkLogId();
		}
		workLog.setLogId(workLogId);
		Boolean flag = workLogMapper.addWorkLog(workLog);
		if(flag) {
			//写入成功返回成功信息
			JSONArray jsb = JSONArray.fromObject(workLog);
			return jsb;
		}
		//写入失败，返回失败信息
		return null;
	}
}

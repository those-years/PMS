package com.pms.service;

import java.util.List;

import com.pms.entity.WorkLog;

import net.sf.json.*;

public interface WorkLogService {
	public JSONArray findWorkLogById(String workLogId);
	public JSONArray getWorkLogPage(String pageNunmber, String pageSize);
	public JSONArray addWorkLog(WorkLog workLog);
	 
}

package com.pms.service;

import java.util.List;

import com.pms.entity.WorkLog;

import net.sf.json.*;

public interface WorkLogService {
	public JSONArray findWorkLogById();
	public List<WorkLog> getAllWorkLog();
}

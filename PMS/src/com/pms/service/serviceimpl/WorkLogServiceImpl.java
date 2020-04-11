package com.pms.service.serviceimpl;

import java.util.*;

import com.pms.entity.WorkLog;
import com.pms.service.WorkLogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WorkLogServiceImpl implements WorkLogService {
	
	@Override
	public JSONArray findWorkLogById() {
		JSONArray jsb;
		List<WorkLog> lists = new ArrayList<>();
		WorkLog workLog;
		for(int i=0; i<4 ;i++) {
			workLog = new WorkLog("1", "1","1", "1","1");
			lists.add(workLog);
		}
		jsb = JSONArray.fromObject(lists);
		return jsb;
	}
	
}

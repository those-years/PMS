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
	
	@Override
	public JSONArray findWorkLogById() {
		JSONArray jsb;
		List<WorkLog> lists = new ArrayList<>();
		WorkLog workLog;
		for(int i=0; i<4 ;i++) {
			workLog = workLogMapper.getWorkLogById("11758");
			if(workLog!=null) {
				lists.add(workLog);
			}
		}
		jsb = JSONArray.fromObject(lists);
		return jsb;
	}
	@Test
	public void test() {
		System.out.println(findWorkLogById().size());
	}
	@Override
	public List<WorkLog> getAllWorkLog() {
		System.out.println(workLogMapper.getAllWorkLog());
		return null;
	}
	
}

package com.pms.dao;

import java.util.*;
import com.pms.entity.*;

public interface WorkLogMapper {
	public List<WorkLog> getAllWorkLog();
	public WorkLog getWorkLogById(String logid);
	public Boolean addWorkLog(WorkLog workLog);
}

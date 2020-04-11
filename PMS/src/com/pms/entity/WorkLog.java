package com.pms.entity;

public class WorkLog {
	private String logId;

	private String studentNo;

	private String commitTime;

	private String title;

	private String content;
	public WorkLog() {};
	public WorkLog(String logId, String studentNo, String commitTime, String title, String content) {
		super();
		this.logId = logId;
		this.studentNo = studentNo;
		this.commitTime = commitTime;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "WorkLog [logId=" + logId + ", studentNo=" + studentNo + ", commitTime=" + commitTime + ", title="
				+ title + ", content=" + content + "]";
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


}

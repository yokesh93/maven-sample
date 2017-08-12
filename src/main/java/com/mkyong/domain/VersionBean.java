package com.mkyong.domain;

public class VersionBean {

	private String appName;	

	private String groupId;	

	private String version;	
	
	private String buildDate;	
	
	private String gitBranch;	
	
	private String gitUser;
	
	private String mailId;

	private String gitCommitId;
	
	private String commitMessage;
	
	private String gitCommitTime;
	
	private String gitTags;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getGitBranch() {
		return gitBranch;
	}

	public void setGitBranch(String gitBranch) {
		this.gitBranch = gitBranch;
	}

	public String getGitUser() {
		return gitUser;
	}

	public void setGitUser(String gitUser) {
		this.gitUser = gitUser;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getGitCommitId() {
		return gitCommitId;
	}

	public void setGitCommitId(String gitCommitId) {
		this.gitCommitId = gitCommitId;
	}

	public String getCommitMessage() {
		return commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	public String getGitCommitTime() {
		return gitCommitTime;
	}

	public void setGitCommitTime(String gitCommitTime) {
		this.gitCommitTime = gitCommitTime;
	}

	public String getGitTags() {
		return gitTags;
	}

	public void setGitTags(String gitTags) {
		this.gitTags = gitTags;
	}
}

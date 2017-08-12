package com.mkyong.configure;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.mkyong.domain.VersionBean;

@Configuration
@PropertySource("classpath:build.properties")
public class VersionConfigure {

	@Value("${Artifact-Id}")
	private String appName;
	
	@Value("${Artifact-GroupId}")
	private String groupId;
	
	@Value("${Artifact-Version}")
	private String version;
	
	@Value("${Build-Date}")
	private String buildDate;
	
	@Value("${Branch-Name}")
	private String gitBranch;
	
	@Value("${Commited-By}")
	private String gitUser;
	
	@Value("${Commited-userID}")
	private String mailId;
	
	@Value("${GIT-Commit-Hash}")
	private String gitCommitId;
	
	@Value("${GIT-Commit-Message}")
	private String commitMessage;
	
	@Value("${Commited-On}")
	private String gitCommitTime;
	
	@Value("${Tag-Name}")
	private String gitTags;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public VersionBean versionBean() {
		VersionBean versionBean=new VersionBean();
		versionBean.setAppName(appName);
		versionBean.setGroupId(groupId);
		versionBean.setVersion(version);
		versionBean.setBuildDate(buildDate);
		versionBean.setGitBranch(gitBranch);
		versionBean.setGitUser(gitUser);
		versionBean.setMailId(mailId);
		versionBean.setGitCommitId(gitCommitId);
		versionBean.setCommitMessage(commitMessage);
		versionBean.setGitCommitTime(gitCommitTime);
		versionBean.setGitTags(gitTags);
		
		
		return versionBean;
				
		
	}
}

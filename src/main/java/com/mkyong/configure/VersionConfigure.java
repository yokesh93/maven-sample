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

	@Value("${build.name}")
	private String appName;
	
	@Value("${build.groupId}")
	private String groupId;
	
	@Value("${build.version}")
	private String version;
	
	@Value("${build.date}")
	private String buildDate;
	
	@Value("${git.branch}")
	private String gitBranch;
	
	@Value("${git.user}")
	private String gitUser;
	
	@Value("${git.user.email}")
	private String mailId;
	
	@Value("${git.commit.id}")
	private String gitCommitId;
	
	@Value("${git.message}")
	private String commitMessage;
	
	@Value("${git.time}")
	private String gitCommitTime;
	
	@Value("${git.tags}")
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

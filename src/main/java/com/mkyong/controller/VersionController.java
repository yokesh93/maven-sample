package com.mkyong.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.configure.VersionConfigure;
import com.mkyong.domain.VersionBean;

@Component
@RestController
public class VersionController {
	@RequestMapping(value="/version")
	public @ResponseBody String getVersionJSON(ModelMap model) throws JsonProcessingException {
		ApplicationContext context =new AnnotationConfigApplicationContext(VersionConfigure.class);
		VersionBean versionBean =(VersionBean)context.getBean("versionBean");
		ObjectMapper mapper =new ObjectMapper();
		//mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		String versionDetails=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(versionBean);
		//model.addAttribute("versionBean",versionDetails);
		//return versionBean;
		
		System.out.println(versionDetails);
		return "<pre>"+versionDetails+"</pre>";
		
	}
}

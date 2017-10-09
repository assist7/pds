package com.assist7.pds.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.assist7.pds.core.converter.DateConverter;

/**
 * mvc配置
 * 
 * @author Qiaoxin.Hong
 *
 */
@Configuration
public class PdsWebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		//日期格式转换器
		registry.addConverter(new DateConverter());
		super.addFormatters(registry);
	}
}

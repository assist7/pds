package com.assist7.pds.core.converter;

import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.assist7.july.utils.bdata.StringUtils;
import com.assist7.july.utils.date.DateUtils;

/**
 * 日期转换器，会匹配默认设置的一些格式，一一进行转换，未匹配到的会返回null
 * 默认格式：yyyy-MM-dd   yyyy-MM-dd HH:mm:ss
 * 
 * @author Qiaoxin.Hong
 *
 */
public class DateConverter implements Converter<String, Date> {
	
	/**
	 * 默认的一些日期格式
	 */
	private final static String[] DATE_PATTERNS = new String[]{DateUtils.PATTERN_DATE, DateUtils.PATTERN_DATETIME};

	@Override
	public Date convert(String source) {
		if (StringUtils.isBlank(source))
			return null;
		return convertEach(source);
	}
	
	/**
	 * 遍历设置的日期格式，一个个匹配，进行转换，如未匹配到则返回null
	 * @param source
	 * @return
	 */
	private Date convertEach(String source) {
		for (String pattern : DATE_PATTERNS) {
			try {
				//未发生异常则匹配到，发生异常继续匹配
				return DateUtils.parse(source, pattern);
			} catch (Exception e) {
			}
		}
		return null;
	}

}

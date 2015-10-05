package com.bbs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

	public static String dateFormat(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat();
		return sdf.format(date);
	}
	
}

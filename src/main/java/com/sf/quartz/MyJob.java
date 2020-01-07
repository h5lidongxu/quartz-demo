package com.sf.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob {
	
	/**
	 * 要执行的任务
	 */
	public void run(){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd | hh:mm:ss");
		String dataStr = simpleDateFormat.format(date);
		System.out.println("自定义作业类执行了"+dataStr);
	}
}

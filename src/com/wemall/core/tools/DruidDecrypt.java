package com.wemall.core.tools;

import com.alibaba.druid.filter.config.ConfigTools;

/**
阿里巴巴数据库加密算法，将数据库密码明文替换“r2vv5fcp”，运行main方法后将打印的密文填在jdbc.properties内
*/
@SuppressWarnings("all")
public class DruidDecrypt {
	public static void main(String[] args){
		try {
			ConfigTools configTools = new ConfigTools ();
			System.out.println(configTools.encrypt("root"));  //这个地方root不用转，只要转密码就可以了。
			System.out.println(configTools.encrypt("1qazxsw2"));//这个就是密码
		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.pms.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MapperUtil {
	public static SqlSession getSqlSession() {
		String resource = "mybatis-config.xml";
		//String resource = "/WebShop/resource/mybatis-config.xml";
		InputStream inputstream = null;
		try {
			inputstream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession openSession = sqlSessionFactory.openSession(true);
		//User user = MapperUtil.getSqlSession().selectOne("com.thoseyears.ssm.UserMapper.getUserById","11758");
		//System.out.println(user);
		return openSession;
	}
}


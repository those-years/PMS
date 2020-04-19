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
		InputStream inputstream = null;
		try {
			inputstream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession openSession = sqlSessionFactory.openSession(true);
		return openSession;
	}
}


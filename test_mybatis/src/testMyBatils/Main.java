package testMyBatils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Main {

	public static void main(String[] args) {
		
		String resource = "conf.xml";
		InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		String statement = "mapping.metadataTableMapping.getMetadataTable";
		MetadataTable metadataTable = sqlSession.selectOne(statement, "build date");
		System.out.println(metadataTable);
		
	}
	
}

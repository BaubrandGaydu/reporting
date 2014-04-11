package docapost.reporting.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {
	private static MysqlDataSource dataSource;
	
public static MysqlDataSource getDataSourceProvider(){
	if(dataSource==null){
		dataSource=new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setDatabaseName("reporting");
		dataSource.setUser("root");
		dataSource.setPassword("hei");
	}
	return dataSource;
}
}

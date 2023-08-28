package in.vk.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class JdbcUtil {

  private JdbcUtil() {}
  
  public static Connection getConnection() throws IOException,SQLException {
	FileInputStream fis  =new FileInputStream(new File("D:\\DavidJames\\January2023\\JavaProgram\\JDBCConsolaBasedCRUDApp\\src\\url.Properties"));
	Properties properties = new Properties();
	properties.load(fis);
	Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("userName"),properties.getProperty("password")); 
	return connection;
  }
  
  public static void closeUp(Connection connection,ResultSet resultSet)throws SQLException {
	  try {
		  if (resultSet!=null)
		    	resultSet.close();
		    if (connection!=null)
		    	connection.close();
		} catch (SQLException e) {	
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	    
  }
}

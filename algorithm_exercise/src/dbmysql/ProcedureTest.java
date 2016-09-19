package dbmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

public class ProcedureTest {
	
	//带单个返回值存储过程调用  
    public void handleSoleData() {  
    	Connection conn = null;
    	CallableStatement cs = null;
    	
        try {  
  
            conn = DB.getConnection();  
            cs = conn.prepareCall("{call pro_stu_count(?)}"); 
            cs.registerOutParameter(1, Types.INTEGER);  
            cs.execute();  
            int count = cs.getInt(1);  
            System.out.println(count);  
  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {
        	DB.close(cs);
        	DB.close(conn);
        }
  
    }  
  
    //带多个返回值存储过程调用  
    public void handleBothData() {  
    	Connection conn = null;
    	CallableStatement cs = null;
    	ResultSet rs = null;
        try {  
            conn = DB.getConnection();  
            cs = conn.prepareCall("call pro_vi()");   
            cs.execute();  
            rs = cs.getResultSet();  
            while(rs.next()) {  
                System.out.println(rs.getInt(1) + "/t" + rs.getString(4) + "/t" + rs.getDate(5));  
            }             
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }  finally {
        	DB.close(rs);
        	DB.close(cs);
        	DB.close(conn);
        }
  
    }  
}

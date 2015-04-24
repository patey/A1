package Lottery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class employees {
	
	public void test(){
		
	}
	
	public static void editEmployeeMysql(String[] user){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("UPDATE employees SET ID ='"+user[0]+"',email ='"+user[2]+"',password ='"+user[3]+"', phone ='"+user[4]+"', phone_number ='"+user[5]+"' WHERE name ='"+user[1]+"'");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	
		private int getRowCount(ResultSet rs) {
		    if (rs == null) {
		        return 0;
		    }
		    try {
		        rs.last();
		        return rs.getRow();
		    } catch (SQLException exp) {
		        exp.printStackTrace();
		    } finally {
		        try {
		            rs.beforeFirst();
		        } catch (SQLException exp) {
		            exp.printStackTrace();
		        }
		    }
		    return 0;
		}
	
	public Object[][] getEmployees(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		Object[][] userList = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM employees");
    	    userList = new Object[getRowCount(rs)][6];
    	    int i = 0;
    	    while (rs.next()){
      	    		userList[i][0] = rs.getString("ID");
      	    		userList[i][1] = rs.getString("name");
      	    		userList[i][2] = rs.getString("email");
      	    		userList[i][3] = rs.getString("password");
      	    		userList[i][4] = rs.getString("phone");
      	    		userList[i][5] = rs.getString("phone_number");
      	    		i++;
    	    	}
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
		return userList;
	}

	public static void addEmployeeMysql(String[] user) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user[0] +"','"+ user[1] +"','"+ user[2] +"','"+ user[3] +"','"+ user[4] +"','"+ user[5] +"')");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	public static void addEmployeeMysql2(String[] user2) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user2[0] +"','"+ user2[1] +"','"+ user2[2] +"','"+ user2[3] +"','"+ user2[4] +"','"+ user2[5] +"')");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	public static void addEmployeeMysql3(String[] user3) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user3[0] +"','"+ user3[1] +"','"+ user3[2] +"','"+ user3[3] +"','"+ user3[4] +"','"+ user3[5] +"')");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	public static void addEmployeeMysql4(String[] user4) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user4[0] +"','"+ user4[1] +"','"+ user4[2] +"','"+ user4[3] +"','"+ user4[4] +"','"+ user4[5] +"')");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	public static void addEmployeeMysql5(String[] user5) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user5[0] +"','"+ user5[1] +"','"+ user5[2] +"','"+ user5[3] +"','"+ user5[4] +"','"+ user5[5] +"')");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
	public static void addEmployeeMysql6(String[] user6) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO employees (ID,email,password,name,phone,phone_number) VALUES ('"+ user6[0] +"','"+ user6[1] +"','"+ user6[2] +"','"+ user6[3] +"','"+ user6[4] +"','"+ user6[5] +"')");    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
	}
}

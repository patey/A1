package Lottery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tickets {
	
	public void addRequested(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM requested");

    	    while(rs.next()){
    	    	String name = rs.getString("name");
    	    	requestedIndividual(name);
    	    }
    	    stmt.executeUpdate("TRUNCATE TABLE requested");
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
	}
	
	private void requestedIndividual(String name) {
		Connection conn = null;
		Statement stmt = null;
		String[] xsettings = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO tickets (owner) VALUES ('" + name + "')");
    	    
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        } 
	}

	public Object[][] getTickets(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		Object[][] ticketList = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT DISTINCT owner FROM tickets");
    	    ticketList = new Object[getRowCount(rs)][2];
    	    int i = 0;
    	    while (rs.next()){
      	    		ticketList[i][1] = rs.getString("owner");
      	    		ticketList[i][0] = amountTicket(rs.getString("owner"));
      	    		i++;
    	    	}
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        
		return ticketList;
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
	
	public Object[][] getRequested(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		Object[][] requestedList = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT DISTINCT name FROM requested");
    	    requestedList = new Object[getRowCount(rs)][6];
    	    int i = 0;
    	    while (rs.next()){
      	    		requestedList[i][1] = rs.getString("name");
      	    		requestedList[i][0] = amountRequest(rs.getString("name"));
      	    		i++;
    	    	}
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        
		return requestedList;
	}
	
public int amountRequest(String name){
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String[] xsettings = null;
    try {
		xsettings = Lottery.properties.readConfig();
        Class.forName("com.mysql.jdbc.Driver").newInstance();
	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
	    stmt = conn.createStatement();
	    rs = stmt.executeQuery("SELECT * FROM requested WHERE name='"+name+"'");
	    
    } catch (Exception ex) {
    	ex.printStackTrace();
    }
	return getRowCount(rs);
}

public int amountTicket(String name){
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String[] xsettings = null;
    try {
		xsettings = Lottery.properties.readConfig();
        Class.forName("com.mysql.jdbc.Driver").newInstance();
	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
	    stmt = conn.createStatement();
	    rs = stmt.executeQuery("SELECT * FROM tickets WHERE owner='"+name+"'");
	    
    } catch (Exception ex) {
    	ex.printStackTrace();
    }
	return getRowCount(rs);
}

public int amountOwn(String name){
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String[] xsettings = null;
    try {
		xsettings = Lottery.properties.readConfig();
        Class.forName("com.mysql.jdbc.Driver").newInstance();
	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
	    stmt = conn.createStatement();
	    rs = stmt.executeQuery("SELECT * FROM tickets WHERE owner='"+name+"'");
	    
    } catch (Exception ex) {
    	ex.printStackTrace();
    }
	return getRowCount(rs);
}
	
}

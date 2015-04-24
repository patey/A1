package Lottery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

public class winners {
	
	public String getCurrent(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		String currentWin = null;
		String[] info = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM winner ORDER BY month DESC LIMIT 1");
    	    
    	    while(rs.next()){
    	    	info = getInfo(rs.getString("name"));
    	    	if (info[0] == "yes"){
    	    		currentWin = rs.getString("name")+",ID "+ getId(rs.getString("name")) +",<br> Phone number: "+ info[2];
    	    	}else{
    	    		currentWin = rs.getString("name")+",ID "+ getId(rs.getString("name")) +",<br> email: "+info[1];
    	    	}
    	    }
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return currentWin;
		
	}
	
	public static String[] getInfo(String employee){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		String[] info = new String[3];
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM employees WHERE name='"+employee+"'");
    	    while (rs.next()){
    	    	info[0] = rs.getString("phone");
    	    	info[1] = rs.getString("email");
    	    	info[2] = rs.getString("phone_number");
    	    	}
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return info;
	}
	
	public static Object[][] getAll(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		Object[][] winList = null;
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM winner ORDER BY month DESC");
    	    winList = new Object[getRowCount(rs)][4];
    	    int i = 0;
    	    while (rs.next()){
      	    		winList[i][0] = rs.getString("ID");
      	    		winList[i][1] = rs.getString("name");
      	    		winList[i][2] = rs.getString("date");
      	    		winList[i][3] = rs.getString("ticket");
      	    		i++;
    	    	}
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return winList;
		
	}
	
	public void pickWinner(){
		int min = 1;
		int max = getMax();
		
		int winner = min + (int)(Math.random() * ((max - min) + 1));
		writeWinner(winner);
	}
	
	public int getMax(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM tickets");
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        System.out.println(getCount(rs));
		return getCount(rs);
	}
	
	public int getCount(ResultSet rs){
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
	public String getTicket(int ticket){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		String winnerName = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT * FROM tickets WHERE number='"+ ticket +"'");
    	    
    	    while(rs.next()){
    	    	winnerName = rs.getString("owner");
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
        return winnerName;
	}
	
	public void writeWinner(int winner){
		StringBuilder sb = new StringBuilder();
		sb.append(winner);
		String new_winner = sb.toString();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		Date date = new Date();
		String wdate = dateFormat.format(date);
		String name = null;
		int idw = 0;
		
        try {
        	name = getTicket(winner);
        	idw = getId(name);
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("INSERT INTO winner (ticket,name,date,id) VALUES ('"+ new_winner +"','"+ name +"','"+ wdate +"','"+ idw +"')");
    	    
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
	private int getId(String name) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		int id = 0;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    rs = stmt.executeQuery("SELECT id FROM employees WHERE name = '"+ name +"'");
    	    while (rs.next()){
    	    id = rs.getInt("ID");
    	    }
    	    
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
		return id;
	}

	public void clearTickets(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String[] xsettings = null;
		
        try {
    		xsettings = Lottery.properties.readConfig();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    conn = DriverManager.getConnection("jdbc:mysql://"+ xsettings[0] +"/"+ xsettings[4] +"?user="+ xsettings[2] +"&password="+ xsettings[3]);
    	    stmt = conn.createStatement();
    	    stmt.executeUpdate("TRUNCATE TABLE tickets");
    	    
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
	private static int getRowCount(ResultSet rs) {
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
}

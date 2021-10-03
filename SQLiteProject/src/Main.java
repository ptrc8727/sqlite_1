import java.sql.*;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Connection con = null;
		try {
			
			Class.forName("org.sqlite.JDBC");
			
			String dbFile = "myfirst.db";
			con = DriverManager.getConnection("jdbc:sqlite:"+dbFile);
			
			System.out.println("\n*** 데이터 조회 ***");
			Statement stat1 = con.createStatement();
			String sql1 = "select * from i_artists;";
			ResultSet rs1 = stat1.executeQuery(sql1);
			while(rs1.next()) {
				
				String id = rs1.getString("id");
				String name = rs1.getString("name");
				System.out.println(id +" "+ name);
				
			}
			
			stat1.close();
			
			System.out.println("\n*** 세 데이터 추가 ***");
			Statement stat2 = con.createStatement();
			
			String sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('방탄소년단', '남성', '2010년대', '2013년', datetime('now', 'localtime'));";
			int cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('심영', '남성', '1950년대', '2021년', datetime('now', 'localtime'));";
			cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('김두한', '남성', '1970년대', '2021년', datetime('now', 'localtime'));";
			cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('정진영', '남성', '1960년대', '2021년', datetime('now', 'localtime'));";
			cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('개코', '남성', '1950년대', '2021년', datetime('now', 'localtime'));";
			cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			sql2 = "insert into i_artists (name, a_type, a_year, debut, regdate)" + " values ('dummy', '00', '0000년대', '0000년', datetime('now', 'localtime'));";
			cnt = stat2.executeUpdate(sql2);
			if(cnt>0)
				System.out.println("new data added");
			else
				System.out.println("error detected in addition");
			
			stat2.close();
			
			System.out.println("\n*** 데이터 조회 ***");
			Statement stat3 = con.createStatement();
			String sql3 = "select * from i_artists;";
			ResultSet rs3 = stat3.executeQuery(sql3);
			while(rs3.next()) {
				
				String id = rs3.getString("id");
				String name = rs3.getString("name");
				System.out.println(id +" "+ name);
				
			}
			
			stat3.close();
			
			System.out.println("\n *** 데이터 수정 ***");
			Statement stat4 = con.createStatement();
			String sql4 = "update i_artists set a_year = '2000년대, 2010년대, 2020년대' " + "where id=6 ;";
			int cnt4 = stat4.executeUpdate(sql4);
			if(cnt>0)
				System.out.println("data edited");
			else
				System.out.println("error detected in edition");
			
			stat4.close();
			
			System.out.println("\n *** 데이터 삭제 *** ");
			Statement stat5 = con.createStatement();
			String sql5 = "delete from i_artists where id=6 ;";
			int cnt5 = stat5.executeUpdate(sql5);
			if(cnt5>0)
				System.out.println("date deleted");
			else
				System.out.println("error detected in delete");
			stat5.close();
			con.close();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			if(con!=null) {
				
				try {
					
					
					
				}catch(Exception e){
					
					
					
				}
				
			}
			
		}
		
	}

}

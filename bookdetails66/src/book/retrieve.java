package book;
import java.sql.*;
public class retrieve {

	public static void main(String[] args) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","Asha");
					Statement stm = con.createStatement();
					ResultSet rs = stm.executeQuery("select * from bookdetails66");
					while(rs.next())
					{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
					"\t"+rs.getString(3));
					}
					con.close();
				}
				catch(Exception e) {
					System.out.print(e.toString());
				}
			}

		}

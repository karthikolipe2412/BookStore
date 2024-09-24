package book;
import java.util.*;
import java.sql.*;
public class Retrivebasedonbookid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try(sc;){
		try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Asha");
        	Statement stm=con.createStatement();
        	System.out.println("enter the bookid:");
        	int bookid=Integer.parseInt(sc.nextLine());
        	ResultSet rs=stm.executeQuery("select * from bookdetails66 where bookid="+bookid+"");
        	if(rs.next()) {
        		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        	}
        	else {
        		System.out.print("invalid book id");
        	}
	}
		catch(Exception e) {
			System.out.print(e.toString());
		}

}
	}}

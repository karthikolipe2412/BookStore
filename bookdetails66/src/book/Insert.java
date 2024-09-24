package book;
import java.util.*;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Asha");
				Statement stm=con.createStatement();
				System.out.println("enyer the book id:");
				int bookid=Integer.parseInt(sc.nextLine());
				System.out.println("enyer the book name:");
				String bookname=sc.nextLine();
				System.out.println("enyer the booktype:");
				String booktype=sc.nextLine();
				int k=stm.executeUpdate("insert into bookdetails66 values("+bookid+",'"+bookname+"','"+booktype+"')");
				if(k>0) {
					System.out.println("detaols updated suuecef:");
				}
				con.close();
				}
			catch(SQLIntegrityConstraintViolationException se) {
				System.out.println("already exists:");}
			catch(Exception e) {
				System.out.println(e.toString());
			}	
			}}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

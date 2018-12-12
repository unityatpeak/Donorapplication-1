package Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Myjd {
public static void main(String[] args) throws ClassNotFoundException {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg709","training709");
		
		Statement st =  con.createStatement();
		
		PreparedStatement pst=con.prepareStatement("insert into TrainReservation values(?,?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter train no.");
		int s1=sc.nextInt();
		pst.setInt(1, s1);
		System.out.println("enter pnr");
		int s2=sc.nextInt();
		pst.setInt(2, s2);
	System.out.println("age");
		int s3=sc.nextInt();
		pst.setInt(3, s3);
		System.out.println("price");
		int s4=sc.nextInt();
		pst.setInt(4,s4);		
		pst.executeUpdate();
		
		//Statement st=con.createStatement();
	//	st.executeQuery("select * from emp");
		//st.execute("INSERT INTO  TrainReservation values(1345,324561,40,250)");
		ResultSet rs=st.executeQuery("select * from TrainReservation");
		while(rs.next())
		{System.out.println(rs.getInt(1));
		System.out.println(rs.getInt(3));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	System.out.println(e);
	}
	
}
}




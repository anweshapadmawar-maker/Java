import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteStudent {
public static void main(String[] args) {
try {
Connection conn =
DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/college&quot;, &quot;root&quot;,
&quot;password&quot;);
PreparedStatement pstmt = conn.prepareStatement(&quot;DELETE FROM Student
WHERE RollNo = ?&quot;);
pstmt.setInt(1, 1);
int rows = pstmt.executeUpdate();
System.out.println(rows + &quot; record(s) deleted successfully.&quot;);
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
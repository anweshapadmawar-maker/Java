import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class UpdateStudent {
public static void main(String[] args) {
try {
Connection conn =
DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/college&quot;, &quot;root&quot;,
&quot;password&quot;);
PreparedStatement pstmt = conn.prepareStatement(&quot;UPDATE Student SET
Percentage = ? WHERE RollNo = ?&quot;);
pstmt.setDouble(1, 85.0);
pstmt.setInt(2, 1);
int rows = pstmt.executeUpdate();
System.out.println(rows + &quot; record(s) updated successfully.&quot;);
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
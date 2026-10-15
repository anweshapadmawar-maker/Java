import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DisplayStudents {
public static void main(String[] args) {
try {
Connection conn =
DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/college&quot;, &quot;root&quot;,
&quot;password&quot;);
Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(&quot;SELECT RollNo, Name FROM Student WHERE
Percentage &gt; 70&quot;);
while (rs.next()) {
System.out.println(&quot;Roll No: &quot; + rs.getInt(1) + &quot;, Name: &quot; +
rs.getString(2));
}
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
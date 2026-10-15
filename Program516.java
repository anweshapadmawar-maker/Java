import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
public class DisplayAllRecords {
public static void main(String[] args) {
try {
Connection conn =
DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/college&quot;, &quot;root&quot;,
&quot;password&quot;);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(&quot;SELECT * FROM Student&quot;);
while (rs.next()) {
System.out.println(&quot;RollNo: &quot; + rs.getInt(1) + &quot;, Name: &quot; +
rs.getString(2) + &quot;, Percentage: &quot; + rs.getDouble(3));
}
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreateAndInsert {
public static void main(String[] args) {
try {
Connection conn =
DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/college&quot;, &quot;root&quot;,
&quot;password&quot;);
Statement stmt = conn.createStatement();
stmt.executeUpdate(&quot;CREATE TABLE IF NOT EXISTS Student (RollNo INT, Name
VARCHAR(50), Percentage DOUBLE)&quot;);
stmt.executeUpdate(&quot;INSERT INTO Student VALUES (1, &#39;Rahul&#39;, 78.5)&quot;);
System.out.println(&quot;Table created and record inserted successfully.&quot;);
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
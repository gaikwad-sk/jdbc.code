import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String url = "jdbc:mysql://127.0.0.1:3306/college";
    private static String user = "root";
    private static String password = "K1s@ng1t@";

    public static void main(String[] args) throws Exception {
        System.out.println("Code of JDBC");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.err.println(rs.getInt(1)+""+rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
* Simple code: connect to a SQLite database and print some information.
*
*/

package yahooSqlite;
 
import java.sql.*;

public class YahooSQLite {
	/**
	* Connect to a sample database
	*/
    public static void testConnect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            String url = "jdbc:sqlite:movies.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACTORS LIMIT 1;");

            while ( rs.next() ) {			
                String  company_id = rs.getString("company_id");
                System.out.println(String.format("company_id: %s", company_id));
				String  company_name = rs.getString("company_name");
                System.out.println(String.format("company_name: %s", company_name));
				String  userID = rs.getString("userID");
                System.out.println(String.format("userID: %s", userID));
				String  product_name = rs.getString("product_name");
                System.out.println(String.format("product_name: %s", product_name));
				String  unit_price = rs.getString("unit_price");
                System.out.println(String.format("unit_price: %s", unit_price));
				String  pay_type = rs.getString("pay_type");
                System.out.println(String.format("pay_type: %s", pay_type));				
            }
            
            rs.close();  
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testConnect();
    }
}
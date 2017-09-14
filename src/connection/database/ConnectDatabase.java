package connection.database;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import project.deliverable.StartProject;
public class ConnectDatabase {
      public void insertData(String query)
      { 
        try{ 
             Connection   con = DriverManager.getConnection("jdbc:ucanaccess://E:\\5th semester\\java\\java.accdb");
             Statement statement = con.createStatement();
             statement.executeUpdate(query);
            }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null , e.getMessage());
         }
      }
      public ResultSet getData(String query)
      {
         ResultSet rset = null;
       try
       {
            Connection   con = DriverManager.getConnection("jdbc:ucanaccess://E:\\5th semester\\java\\java.accdb");
            System.out.print("\n Connection established \n");
            Statement statement = con.createStatement();
            rset =  statement.executeQuery(query);
            return rset;
             
       }
       catch(Exception e)
       {
        JOptionPane.showMessageDialog(null, e.getMessage());
       }
        return rset;
    }
      
    public static void main(String[] args) {  
        StartProject sp = new StartProject();
        sp.setVisible(true);
        sp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}
}

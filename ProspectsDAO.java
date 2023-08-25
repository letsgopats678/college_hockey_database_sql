package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import core.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 *
 * @author Gokhan
 */
public class ProspectsDAO implements DAO<Prospects>
{   
    public ProspectsDAO() {
        
    }
    List<Prospects> prospects;
    /**
     * Get a single contact entity as a contact object
     * @param id
     * @return 
     */
    @Override
    public Optional<Prospects> get(int id) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM Prospects WHERE id = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            Prospects prospect = null;
            while (rs.next()) {
                prospect = new Prospects(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("college"), rs.getString("nhlTeam"), rs.getString("age"), rs.getString("position"), rs.getString("draftSelection"));
            }
            return Optional.ofNullable(prospect);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all contact entities as a List
     * @return 
     */
    @Override
    public List<Prospects> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        prospects = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Prospects ORDER BY id";
            rs = db.executeQuery(sql);
            Prospects prospect = null;
            while (rs.next()) {
                prospect = new Prospects(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("college"), rs.getString("nhlTeam"), rs.getString("age"), rs.getString("position"), rs.getString("draftSelection"));
                prospects.add(prospect);
            }
            return prospects;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert a contact object into contact table
     * @param prospect 
     */
    @Override
    public void insert(Prospects prospect)
    {
        DB db = DB.getInstance();
        try {
            String sql = "INSERT INTO Prospects(ID, firstName, lastName, college, nhlTeam, age, position, draftSelection) VALUES (?, ?, ?, ?,?, ?, ?, ?)";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, prospect.getID());
            stmt.setString(2, prospect.getFirstName());
            stmt.setString(3, prospect.getLastName());
            stmt.setString(4, prospect.getCollege());
            stmt.setString(5, prospect.getNHLTeam());
            stmt.setString(6, prospect.getAge());
            stmt.setString(7, prospect.getPosition());
            stmt.setString(8, prospect.getDraftSelection());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new prospect was inserted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a contact entity in database if it exists using a contact object
     * @param prospect
     */
    @Override
    public void update(Prospects prospect) {
        DB db = DB.getInstance();
        try {
            String sql = "UPDATE Prospects SET firstName=?, lastName=?, college=?, nhlTeam=?, age=?, position=?, draftSelection=? WHERE id=?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, prospect.getFirstName());
            stmt.setString(2, prospect.getLastName());
            stmt.setString(3, prospect.getCollege());
            stmt.setString(4, prospect.getNHLTeam());
            stmt.setString(5, prospect.getAge());
            stmt.setString(6, prospect.getPosition());
            stmt.setString(7, prospect.getDraftSelection());
            stmt.setInt(8, prospect.getID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing prospect was updated successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a contact from contact table if the entity exists
     * @param prospect 
     */
    @Override
    public void delete(Prospects prospect) {
        DB db = DB.getInstance();
        try {
            String sql = "DELETE FROM Prospects WHERE ID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, prospect.getID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A prospect was deleted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Get all column names in a list array
     * @return 
     */
    @Override
    public List<String> getColumnNames() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        List<String> headers = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Prospects WHERE ID = -1";//We just need this sql query to get the column headers
            rs = db.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            //Get number of columns in the result set
            int numberCols = rsmd.getColumnCount();
            for (int i = 1; i <= numberCols; i++) {
                headers.add(rsmd.getColumnLabel(i));//Add column headers to the list
            }
            return headers;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        } 
    }
}

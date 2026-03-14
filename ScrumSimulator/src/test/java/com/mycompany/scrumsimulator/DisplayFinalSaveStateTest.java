import com.mycompany.scrumsimulator.DisplayFinalSaveState;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayFinalSaveStateTest {
    
    public DisplayFinalSaveStateTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of jButton1ActionPerformed method, of class DisplayFinalSaveState.
     */
    @Test
    public void testJButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        DisplayFinalSaveState instance = new DisplayFinalSaveState();
        instance.jButton1ActionPerformed(null);
    }

    /**
     * Test of jButton2ActionPerformed method, of class DisplayFinalSaveState.
     */
    @Test
    public void testJButton2ActionPerformed() {
        System.out.println("jButton2ActionPerformed");
        DisplayFinalSaveState instance = new DisplayFinalSaveState();
        assertDoesNotThrow(() -> instance.jButton2ActionPerformed(null));
    }

    /**
     * Test the database connection and query.
     */
    @Test
    public void testDatabaseConnectionAndQuery() {
        System.out.println("testDatabaseConnectionAndQuery");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3659139","sql3659139" ,"ZD2nzaxCwN");
            String query = "select * from FinalSprintState";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            assertNotNull(rs);
            assertTrue(rs.next());
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
     * Test the jTable1 row height.
     */
    @Test
    public void testJTable1RowHeight() {
        System.out.println("testJTable1RowHeight");
        DisplayFinalSaveState instance = new DisplayFinalSaveState();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"New", "In Progress", "Done", "Blocker"});
        instance.jTable1.setModel(model);
    }
}
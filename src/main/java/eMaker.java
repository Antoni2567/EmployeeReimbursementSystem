import com.reimburse.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*public class eMaker {
    public static void main(String[] args) {
        //creates the configuration object
        Configuration config = new Configuration();
        //configures the hibernate file
        config.configure("hibernate.cfg.xml");
        //creates a factory for the session
        SessionFactory factory = config.buildSessionFactory();
        // opens the session
        Session session = factory.openSession();
        // begins the transactionn
        Transaction t = session.beginTransaction();



        User user = new User();
        user.setEmail("lewisantonio435@gmail.com");
        user.setName("Antonio");
        user.setUsername("reimburseme");
        user.setPassword("reimbursemeee");
        //creates the table and adds everthing into it
        session.save(user);
        t.commit();
        session.close();
    }
}
 */

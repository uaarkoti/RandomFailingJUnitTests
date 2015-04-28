import com.cloudbees.test.ExtendedRunner;
import com.cloudbees.test.Repeat;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.fail;
import java.util.Random;

/**
 * @author Udaypal Aarkoti
 * Tests failing randomly
 */
@RunWith(ExtendedRunner.class)
public class ExampleTest {
  @Test
  @Repeat(10)
  public void sometimesFail() {
    int rand = new Random().nextInt(5);
    if (rand % 5 == 0) {
      fail();
    }
  }
}

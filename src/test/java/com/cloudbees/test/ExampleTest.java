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
    int rand = new Random().nextInt(3);
    if (rand % 3 == 0) {
      fail();
    }
  }

  @Test
  @Repeat(10)
  public void otherFailingTests() {
    int rand = new Random().nextInt(3);
    if (rand % 3 == 0) {
      fail();
    }
  }
}

import com.cloudbees.test.ExtendedRunner;
import com.cloudbees.test.Repeat;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;
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
    int randFail = new Random().nextInt(6);
    int randSkip = new Random().nextInt(7);
    if (randFail % 6 == 0) {
      fail();
    }
    else if(randSkip % 7 == 0) {
      assumeTrue(false);
    }
  }
}

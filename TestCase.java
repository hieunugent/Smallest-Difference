import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class TestCase{
  @Test
  public void Testcase1(){
    int[] expected = {20, 17};
    assertTrue(Arrays.equals(SmallestDiff.smallestDifference(new int[]{-1, 5, 10, 20, 3}, new int[]{26, 134, 135, 15, 17}), expected));
  }

}

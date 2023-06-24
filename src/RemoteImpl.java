package src;

import java.util.Random;

public class RemoteImpl implements RemoteInterface {

  private static final Random RANDOM = new Random(System.currentTimeMillis());

  /**
   * Returns a value between 0 and 100, inclusive.
   * Returns `42` about 1/4th of the time.
   */
  @Override
  public Integer getAnswer() {
    final var answer = RANDOM.nextInt(133);
    return Integer.valueOf(answer > 100 ? 42 : answer);
  }

}

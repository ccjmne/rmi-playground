package src;

import java.util.Random;

public class RemoteImpl implements RemoteInterface {

  private static final Random RANDOM = new Random(System.currentTimeMillis());

  @Override
  public Integer getAnswer() {
    return Integer.valueOf(RANDOM.nextInt(1000));
  }

}

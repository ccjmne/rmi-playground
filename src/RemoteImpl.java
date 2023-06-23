package src;

import java.util.Random;

public class RemoteImpl implements RemoteInterface {

  private static final Random R = new Random(System.currentTimeMillis());

  @Override
  public Integer getAnswer() {
    return Integer.valueOf(R.nextInt(1000));
  }

}

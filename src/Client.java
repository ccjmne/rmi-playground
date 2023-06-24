package src;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {

  public static void main(final String[] args) {
    try {
      final var remote = (RemoteInterface) LocateRegistry
          .getRegistry(RemoteConfig.PORT)
          .lookup(RemoteConfig.REGISTRY_NAME);

      final var start = System.nanoTime();
      final var answer = remote.getAnswer();
      final var duration = System.nanoTime() - start;

      System.out.println(String.format(
          "%-24s~%.2fms",
          String.format("Received %d%s", answer, answer == 42 ? ", how nice!" : ""),
          duration / 1_000_000f));
    } catch (final RemoteException | NotBoundException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
  }

}

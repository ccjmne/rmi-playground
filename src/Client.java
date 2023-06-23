package src;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {

  public static void main(final String[] args) {
    try {
      final RemoteInterface remote = (RemoteInterface) LocateRegistry
          .getRegistry(RemoteConfig.PORT)
          .lookup(RemoteConfig.REGISTRY_NAME);

      final Integer answer = remote.getAnswer();
      System.out.println(String.format(
          answer == 42
              ? "Received: %d, how nice!"
              : "Received: %d",
          answer));
    } catch (final RemoteException | NotBoundException e) {
      e.printStackTrace();
    }
  }

}

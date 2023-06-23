package src;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {

  public static void main(final String[] args) {
    try {
      final RemoteInterface remote = (RemoteInterface) LocateRegistry.getRegistry(RemoteConfig.PORT)
          .lookup(RemoteConfig.REGISTRY_NAME);
      System.out.println(String.format("Received: %d", remote.getAnswer()));
    } catch (final RemoteException | NotBoundException e) {
      e.printStackTrace();
    }
  }

}

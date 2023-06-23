package src;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {

  public static void main(final String[] args) {
    try {
      final Interface iface = (Interface) LocateRegistry.getRegistry(Config.PORT).lookup(Config.REGISTRY_NAME);
      System.out.println(String.format("Received: %d", iface.getAnswer()));
    } catch (final RemoteException | NotBoundException e) {
      e.printStackTrace();
    }
  }

}

package src;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

  public static void main(final String args[]) {
    try {
      LocateRegistry
          .createRegistry(RemoteConfig.PORT)
          .bind(RemoteConfig.REGISTRY_NAME, UnicastRemoteObject.exportObject(new RemoteImpl(), 0));

      System.out.println(String.format("Server listening on port %d", RemoteConfig.PORT));
    } catch (final RemoteException | AlreadyBoundException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
  }

}

package src;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

  public static void main(final String args[]) {
    try {
      LocateRegistry
          .createRegistry(Config.PORT)
          .bind(
              Config.REGISTRY_NAME,
              UnicastRemoteObject.exportObject(new Impl(), 0));

      System.out.println(String.format("Server listening on port %d", Config.PORT));
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }

}

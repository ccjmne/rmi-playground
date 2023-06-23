package src;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

  /**
   * Save the RMI interface in a `static` field so as to prevent
   * Garbage-Collection from terminating our VM.
   *
   * @see https://stackoverflow.com/a/25879653/2427596
   */
  private static Remote REMOTE_IMPL;
  static {
    try {
      REMOTE_IMPL = UnicastRemoteObject.exportObject(new RemoteImpl(), 0);
    } catch (final RemoteException e) {
      e.printStackTrace();
    }
  }

  public static void main(final String args[]) {
    try {
      LocateRegistry.createRegistry(RemoteConfig.PORT).bind(RemoteConfig.REGISTRY_NAME, REMOTE_IMPL);
      System.out.println(String.format("Server listening on port %d", RemoteConfig.PORT));
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }

}

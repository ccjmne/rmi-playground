package src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

  public Integer getAnswer() throws RemoteException;

}

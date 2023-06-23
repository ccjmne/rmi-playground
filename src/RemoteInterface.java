package src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {

  public Integer getAnswer() throws RemoteException;

}

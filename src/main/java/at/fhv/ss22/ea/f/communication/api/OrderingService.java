package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SoundCarrierOrderDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OrderingService extends Remote {

    boolean placeOrder(String sessionId, SoundCarrierOrderDTO orderDTO) throws RemoteException, SessionExpired, NoPermissionForOperation;

    boolean approveOrder(String sessionId, SoundCarrierOrderDTO orderDTO) throws RemoteException, SessionExpired, NoPermissionForOperation;

    boolean denyOrder(String sessionId, SoundCarrierOrderDTO orderDTO) throws RemoteException, SessionExpired, NoPermissionForOperation;
}

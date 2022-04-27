package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.MessageDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessagingService extends Remote {

    boolean publish(String sessionId, MessageDTO message) throws RemoteException, SessionExpired, NoPermissionForOperation;

    List<String> getSubscribedTopics(String sessionId) throws RemoteException, SessionExpired, NoPermissionForOperation;
}

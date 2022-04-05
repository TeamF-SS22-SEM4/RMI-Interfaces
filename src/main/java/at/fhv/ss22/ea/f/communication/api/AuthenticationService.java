package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.LoginResultDTO;
import at.fhv.ss22.ea.f.communication.exception.AuthenticationFailed;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationService extends Remote {

    LoginResultDTO login(String username, String password) throws AuthenticationFailed, RemoteException;
}

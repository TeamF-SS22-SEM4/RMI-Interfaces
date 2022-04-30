package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.LoginResultDTO;
import at.fhv.ss22.ea.f.communication.exception.AuthenticationFailed;

import javax.ejb.Remote;


@Remote
public interface AuthenticationService {

    LoginResultDTO login(String username, String password) throws AuthenticationFailed;
}

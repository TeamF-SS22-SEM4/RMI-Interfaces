package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.MessageDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;
import java.time.LocalDateTime;
import java.util.List;

@Remote
public interface MessagingService {

    boolean publish(String sessionId, MessageDTO message) throws SessionExpired, NoPermissionForOperation;

    List<String> getSubscribedTopics(String sessionId) throws SessionExpired, NoPermissionForOperation;

    void updateLastViewed(String sessionId, LocalDateTime lastViewedMessages) throws SessionExpired, NoPermissionForOperation;

    LocalDateTime getLastViewed(String sessionId) throws SessionExpired, NoPermissionForOperation;
}

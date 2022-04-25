package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LoginResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sessionId;
    private String employeeId;
    private List<String> roles = new LinkedList<>();
    private List<String> topicNames = new LinkedList<>();

    public String getSessionId() {
        return sessionId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }

    public List<String> getTopicNames() {
        return Collections.unmodifiableList(topicNames);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private LoginResultDTO instance;

        public Builder() {
            this.instance = new LoginResultDTO();
        }

        public Builder withTopicNames(List<String> topicNames) {
            this.instance.topicNames = topicNames;
            return this;
        }

        public Builder withId(String sessionId) {
            this.instance.sessionId = sessionId;
            return this;
        }

        public Builder withEmployeeId(String employeeId) {
            this.instance.employeeId = employeeId;
            return this;
        }

        public Builder withRoles(List<String> roles) {
            this.instance.roles = roles;
            return this;
        }
        public LoginResultDTO build() {
            return this.instance;
        }
    }
}

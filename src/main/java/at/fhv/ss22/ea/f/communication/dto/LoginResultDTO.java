package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class LoginResultDTO implements Serializable {
    private String sessionId;
    private List<String> roles;

    public String getSessionId() {
        return sessionId;
    }

    public List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private LoginResultDTO instance;

        public Builder() {
            this.instance = new LoginResultDTO();
        }

        public Builder withId(String sessionId) {
            this.instance.sessionId = sessionId;
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

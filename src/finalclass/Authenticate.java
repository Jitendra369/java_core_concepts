package finalclass;

import java.util.Collections;
import java.util.List;

public final class Authenticate {

    private final String username;
    private final String password;
    private final List<String> authenticatedApps;

    public Authenticate(String username, String password, List<String> authenticatedApps) {
        this.username = username;
        this.password = password;
        this.authenticatedApps = authenticatedApps;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getAuthenticatedApps() {
        return Collections.unmodifiableList(authenticatedApps);
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Authenticate{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authenticatedApps=" + authenticatedApps +
                '}';
    }
}

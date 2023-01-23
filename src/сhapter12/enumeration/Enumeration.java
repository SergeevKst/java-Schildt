package сhapter12.enumeration;

public enum Enumeration {
    ADMINISTRATOR("Admin"),
    USER("User");
    private String role;

    public String getRole() {
        return role;
    }

    Enumeration(String role) {
        this.role = role;
    }
}

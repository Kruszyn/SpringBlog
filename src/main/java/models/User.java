package models;


public class User {


    private Long id;
    private String username;
    private String passwordHash;
    private String fullName;

    public User() {}

    public User(Long id, String username, String fullName) {
        this.id= id;
        this.username = username;
        this.fullName = fullName;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getFullName() {
        return fullName;
    }
}
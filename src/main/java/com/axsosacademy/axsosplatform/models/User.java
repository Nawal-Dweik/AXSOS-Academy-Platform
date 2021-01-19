package com.axsosacademy.axsosplatform.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 1, message = "Name must not be empty")
    private String name;
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9.-]+$", message = "Invalid email pattern")
    private String email;
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
    @Transient
    private String passwordConfirmation;
    @Column(updatable = false)
    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }


    //////////////////////////////////////////////////////
//    Relationships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private Role role;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_messages",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "message_id")
    )
    private List<Message> messages;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="algorithmTopic_id")
    private Algorithm algorithm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="algorithmUser_id")
    private GroupActivity groupActivity;

    public  User(){}

    public User(String name, String email, String password, String passwordConfirmation, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public GroupActivity getGroupActivity() {
        return groupActivity;
    }

    public void setGroupActivity(GroupActivity groupActivity) {
        this.groupActivity = groupActivity;
    }
}

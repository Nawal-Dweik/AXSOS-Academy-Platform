package com.axsosacademy.axsosplatform.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "groupActivities")
public class GroupActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

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

    @OneToMany(mappedBy="groupActivity", fetch = FetchType.LAZY)
    private List<Category> categories;

    @OneToMany(mappedBy="groupActivity", fetch = FetchType.LAZY)
    private List<User> users;

    public GroupActivity() {

    }

    public GroupActivity(String title, String description, List<Category> categories, List<User> users) {
        this.title = title;
        this.description = description;
        this.categories = categories;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

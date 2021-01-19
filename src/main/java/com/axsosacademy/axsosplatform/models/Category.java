package com.axsosacademy.axsosplatform.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="groupActivity_id")
    private GroupActivity  groupActivity;

    public Category() {

    }

    public Category(String name, GroupActivity groupActivity) {
        this.name = name;
        this.groupActivity = groupActivity;
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

    public GroupActivity getGroupActivity() {
        return groupActivity;
    }

    public void setGroupActivity(GroupActivity groupActivity) {
        this.groupActivity = groupActivity;
    }
}

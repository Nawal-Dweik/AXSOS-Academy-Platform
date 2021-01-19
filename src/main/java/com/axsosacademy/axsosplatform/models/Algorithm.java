package com.axsosacademy.axsosplatform.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "algorithms")
public class Algorithm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String question;

    @NotNull
    private String answer;
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

    //////////////////////////////////
//    RELATION

    @OneToMany(mappedBy="algorithm", fetch = FetchType.LAZY)
    private List<Topic> topics;

    @OneToMany(mappedBy="algorithm", fetch = FetchType.LAZY)
    private List<User> users;

    public Algorithm() {

    }

    public Algorithm(String title, String question, String answer, List<Topic> topics, List<User> users) {
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.topics = topics;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

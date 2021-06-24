package com.indialone.courseapijavabrainsdata.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String topic;

    public Topic() {

    }

    public Topic(String id, String name, String topic) {
        super();
        this.id = id;
        this.name = name;
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

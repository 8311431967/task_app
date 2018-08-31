package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private String status;
    private Date dueDate;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;

    public Task() { //Required for Instantiation
        super();
    }

    public Task(Long id, String text, Date dueDate) {
        super();
        this.id = id;
        this.text = text;
        this.dueDate = dueDate;
    }
}

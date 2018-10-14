package io.alauda.todo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Authority implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "username",referencedColumnName="username")
    private User user;
}

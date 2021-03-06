package io.alauda.todo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="project_id")
    private Long projectId;

    private String title;

    @OneToMany(mappedBy = "cardId")
    private List<Todo> todoList;
}

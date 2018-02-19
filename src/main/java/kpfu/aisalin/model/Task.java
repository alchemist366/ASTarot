package kpfu.aisalin.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Builder
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;

    @Column(nullable = true)
    private Date deadline;

    @Column(nullable = false)
    private String taskName;

    @Column
    private String description;

    @Column
    private boolean ready;

    @ManyToOne
    private Project project;

    @ManyToMany
    private List<Users> users;
}


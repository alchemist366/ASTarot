package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;

    @Column(nullable = true)
    private Date deadline;

    @Column(nullable = false)
    private String taskName;

    @ManyToMany
    private List<Users> users;

    @Column
    private String description;

    @Column
    private boolean ready;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="project_id")
    private Project project;


}


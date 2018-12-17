package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long projectId;

    @Column (nullable = false)
    private Date creationDate;

    @Column (nullable = true)
    private Date deadline;

    @Column (nullable = false)
    private String projectName;

    @Column
    private boolean ready;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "taskId")
    private List<Task> tasks;


    @ManyToMany
    private List<Company> companies;
}

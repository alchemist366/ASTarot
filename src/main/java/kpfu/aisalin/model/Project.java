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

    @ManyToMany
    private List<Company> companies;
}

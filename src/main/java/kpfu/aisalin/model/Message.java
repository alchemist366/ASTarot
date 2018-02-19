package kpfu.aisalin.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Builder
@Setter
public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long messageId;

    @Column (nullable = false)
    private Date date;

    @Column (nullable = false)
    private String message;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Task task;
}

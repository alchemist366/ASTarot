package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
    private Users users;

    @ManyToOne
    private Task task;
}

package kpfu.aisalin.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Builder
@Setter
public class Attachment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long attachmentId;

    @Column (nullable = false)
    private String filePath;

    @ManyToOne
    private Message message;

}

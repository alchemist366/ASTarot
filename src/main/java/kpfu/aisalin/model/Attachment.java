package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

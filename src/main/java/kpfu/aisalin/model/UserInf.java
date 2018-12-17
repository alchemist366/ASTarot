package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class UserInf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userInfId;

    @Column
    private String telNum;

    @Column
    private String address;

    @Column(nullable = false)
    private String fio;

    @Column
    private int salary;

}

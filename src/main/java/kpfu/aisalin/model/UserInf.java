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
public class UserInf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userInfId;

    @Column(nullable = false)
    private boolean gender;

    @Column(nullable = false)
    private Date birthday;

    @Column
    private String telNum;

    @Column
    private String address;

    @Column(nullable = false)
    private String fio;

    @Column
    private int salary;

    @OneToOne
    @JoinColumn( name = "userId")
    private Users user;

}

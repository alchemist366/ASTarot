package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class Company {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long comId;

    @Column
    private int employeesCount;

    @Column
    private String telNum;

    @Column
    private String address;

    @Column (nullable = false)
    private String comName;
}

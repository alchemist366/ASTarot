package kpfu.aisalin.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Setter
public class Users {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Company> companies;

    @ManyToMany
    private List<Task> tasks;

    @Column(nullable = false)
    private String role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_inf_id")
    private UserInf userInf;

    @Column
    private int workedHours;

    @Column
    private String img;

    @Override
    public String toString() {
        return String.format(
                "Users[id=%d, firstName='%s', lastName='%s']",
                userId, login, password);
    }

}

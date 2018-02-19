package kpfu.aisalin.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@Setter
public class Users {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Company> company;

    @Column(nullable = false)
    private String role;

    @Override
    public String toString() {
        return String.format(
                "Users[id=%d, firstName='%s', lastName='%s']",
                userId, login, password);
    }
}

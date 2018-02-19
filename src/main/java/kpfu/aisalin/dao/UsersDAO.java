package kpfu.aisalin.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import kpfu.aisalin.model.Users;
import org.springframework.data.repository.query.Param;

import java.util.List;
//import org.springframework.data.jpa.repository.Query;
//
//import org.springframework.data.repository.query.Param;

public interface UsersDAO extends CrudRepository<Users, Long> {
//    @Query("SELECT n.name FROM Users n where n.id = :id")
//    String findNameById(@Param("id") Long id);
//    @Query("SELECT p.password FROM Users p where p.login = :login")
//    String findPasswordByLogin(@Param("login") String login);
//    List<Users> findAllByLogin(String login);
}

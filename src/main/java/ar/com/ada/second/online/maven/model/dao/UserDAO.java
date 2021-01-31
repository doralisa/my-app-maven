package ar.com.ada.second.online.maven.model.dao;

//DAO: Data Access Object

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDAO {

    private Integer id;
    private String nickname;
    private String email;

}

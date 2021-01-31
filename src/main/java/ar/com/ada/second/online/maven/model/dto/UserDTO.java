package ar.com.ada.second.online.maven.model.dto;

// DTO: Data Transfer Object

import ar.com.ada.second.online.maven.controller.UserController;
import ar.com.ada.second.online.maven.vista.MainView;
import ar.com.ada.second.online.maven.vista.UserView;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private Integer id;
    private String nickname;
    private String email;

    public UserDTO (String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }
}

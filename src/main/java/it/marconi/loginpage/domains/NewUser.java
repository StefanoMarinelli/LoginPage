package it.marconi.loginpage.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewUser {

    private String nickname;

    private String email;

    private String pwd;

}

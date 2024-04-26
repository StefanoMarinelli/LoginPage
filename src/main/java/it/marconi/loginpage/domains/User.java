package it.marconi.loginpage.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    
    private String nickname;

    private String email;

    private String pwd;

}

package model;

import lombok.*;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private int id;
    private String username;
    private String email;
    private String password;

}

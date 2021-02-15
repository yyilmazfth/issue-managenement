package indv.fth.springuyg.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends Serializers.Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "uname", unique = true)
    private String username;

    @Column(name = "pwd")
    private String password;


    @Column(name = "name_surname")
    private String nameSurname;

    @Column(name = "email")
    private String email;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;


}

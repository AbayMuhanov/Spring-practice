package muha.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    private String login;

    private String password;

    private String name;

    @Column(name = "last_name")
    private String lastNane;

//    private Integer dateOfCreation;

//    @Column(name = "registration_date")
//    private LocalDateTime registrationDate;
//
//    @OneToMany(mappedBy = "user")
//    private List<Order> orders;
//
//    @OneToMany(mappedBy = "user")
//    List<Feedback> feedbacks;

    public User() {

    }

}

package ua.route.share.core.user;

import lombok.Getter;
import lombok.Setter;
import ua.route.share.core.BaseEntityAudit;

import javax.persistence.*;

/**
 * Created by greg on 31.01.16.
 */
@Entity
@Table(name = "User")
@Getter
@Setter
@AttributeOverride(name = "id", column = @Column(name = "user_id",
        nullable = false))
public class User extends BaseEntityAudit {
    @Column(unique = true)
    private String login;
    @Column
    private String password;
    @Column
    private String city;
    @Column
    private String info;

    public User() {
    }
}

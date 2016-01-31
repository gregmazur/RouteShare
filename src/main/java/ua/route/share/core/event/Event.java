package ua.route.share.core.event;

import lombok.Getter;
import lombok.Setter;
import ua.route.share.core.Point;
import ua.route.share.core.BaseEntityAudit;
import ua.route.share.core.route.Route;
import ua.route.share.core.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by greg on 31.01.16.
 */
@Entity
@Table(name = "Event")
@AttributeOverride(name = "id", column = @Column(name = "event_id",
        nullable = false))
@Getter @Setter
public class Event extends BaseEntityAudit {
    @Embedded
    private Point point;
    @Column
    private Route route;
    @OneToMany
    @JoinTable(name = "\"users_tagged_at_event\"")
    private Collection<User> usersTagged = new ArrayList<>();

    public Event(Point point) {
        super();
        this.point = point;
    }


    public Event() {
    }
}

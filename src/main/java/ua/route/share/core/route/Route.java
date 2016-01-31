package ua.route.share.core.route;

import lombok.Getter;
import lombok.Setter;
import ua.route.share.core.BaseEntityAudit;
import ua.route.share.core.Point;
import ua.route.share.core.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by greg on 31.01.16.
 */
@Entity
@Table(name = "Route")
@AttributeOverride(name = "id", column = @Column(name = "route_id",
        nullable = false))
@Getter @Setter
public class Route extends BaseEntityAudit {


    @ElementCollection
    private Collection<Point> routePoints = new ArrayList<Point>();


    @OneToMany
    @JoinTable(name = "\"users_tagged_at_route\"")
    private Collection<User>
            usersTagged = new ArrayList<User>();


    public Route() {
    }


    public synchronized void addPoint(Point point) {
        routePoints.add(point);
    }
}

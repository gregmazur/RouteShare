package ua.route.share.core.event;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.route.share.core.route.Route;

import java.util.Collection;
import java.util.List;

/**
 * Created by greg on 31.01.16.
 */
@RepositoryRestResource(path = "event")
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
    @Query("SELECT e FROM  Event e WHERE e.createdBy.id = :userId")
    Collection<Event> findByCreatedBy(
            @Param("userId") Long userId);


    @Query ("SELECT e FROM Event e WHERE e.name LIKE CONCAT('%',:name,'%')")
    Collection<Event> findByNameContaining(@Param ("name") String name);


    /**
     * Created with Spring DATA
     *
     * @param route
     * @return
     */
    List<Event> findByRoute(Route route);


    Event findByName(String name);
}

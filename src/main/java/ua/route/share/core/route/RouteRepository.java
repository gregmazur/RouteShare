package ua.route.share.core.route;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by greg on 31.01.16.
 */
@RepositoryRestResource(path = "route")
public interface RouteRepository extends PagingAndSortingRepository<Route, Long> {
    @Query("SELECT r FROM  Route r WHERE r.createdBy.id = :userId")
    Collection<Route> findByCreatedBy(@Param("userId") Long userId);


    @Query("SELECT r FROM Route r WHERE r.name LIKE CONCAT('%',:entered_name,'%')")
    Collection<Route> getRouteContainsName(@Param("entered_name") String name);


    Route findByName(String name);
}

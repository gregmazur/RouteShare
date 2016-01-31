package ua.route.share.core.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by greg on 31.01.16.
 */
@Service
@Transactional
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route addRoute(Route route){return routeRepository.save(route);}


}

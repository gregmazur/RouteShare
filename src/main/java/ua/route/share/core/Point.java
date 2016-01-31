package ua.route.share.core;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by greg on 31.01.16.
 */
@Embeddable
@Data
public class Point implements Serializable {
    @Column
    private double longitude;
    @Column
    private double latitude;


    public Point() {
    }


    public Point(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}

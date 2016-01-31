package ua.route.share.core;

import ua.route.share.core.user.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by greg on 31.01.16.
 */
@MappedSuperclass
public abstract class BaseEntityAudit extends BaseEntity {


    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;




    @Column(name = "createdBy", length = 20)
    private User createdBy;


    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;




    @Column(name = "updated_by", length = 20)
    private User updatedBy;


    public Date getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public User getCreatedBy() {
        return createdBy;
    }


    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }


    public Date getUpdatedAt() {
        return updatedAt;
    }


    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


    public User getUpdatedBy() {
        return updatedBy;
    }


    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Sets createdAt before insert
     */
    @PrePersist
    public void setCreationDate() {
        this.createdAt = new Date();
    }


    /**
     * Sets updatedAt before update
     */
    @PreUpdate
    public void setChangeDate() {
        this.updatedAt = new Date();
    }

}

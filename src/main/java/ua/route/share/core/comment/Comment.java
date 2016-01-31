package ua.route.share.core.comment;

import lombok.Getter;
import lombok.Setter;
import ua.route.share.core.BaseEntityAudit;
import ua.route.share.core.BaseEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by greg on 31.01.16.
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "comment_id",
        nullable = false))
@Getter @Setter
public class Comment extends BaseEntityAudit {
    @Column
    private BaseEntity owner;
    @Column
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }
}

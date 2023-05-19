/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Components implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    crop;
    private String    variety;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Components() {}

    public Components(Components value) {
        this.id = value.id;
        this.crop = value.crop;
        this.variety = value.variety;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Components(
        Integer   id,
        String    crop,
        String    variety,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.crop = crop;
        this.variety = variety;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Components (");

        sb.append(id);
        sb.append(", ").append(crop);
        sb.append(", ").append(variety);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}

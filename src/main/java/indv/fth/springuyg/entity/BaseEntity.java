package indv.fth.springuyg.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Tum entityler uzerinde ortak olan alanlar icin olusturulan base entity classi
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="created_by",length = 254)
    private String createdBy;
    @Column(name="updated_at")
    private Date updatedAt;
    @Column(name="updated_by",length = 254)
    private String updatedBy;
    @Column(name="status")
    private Boolean status;


}
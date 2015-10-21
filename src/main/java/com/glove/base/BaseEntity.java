package com.glove.base;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Frank on 2015/10/21.
 */
public class BaseEntity implements Serializable{

    @Id
    @Column(name="id",length=32,nullable=false,unique=true)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

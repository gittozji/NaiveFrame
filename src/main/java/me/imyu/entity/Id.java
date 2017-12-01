package me.imyu.entity;

import java.io.Serializable;

/**
 * Created by imyu on 2017-12-01.
 */
public class Id implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

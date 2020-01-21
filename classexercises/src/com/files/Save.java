package com.files;

import java.io.Serializable;

public class Save implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long nLong;

    public Save(Long nLong) {
        this.nLong = nLong;
    }

    public Long getnLong() {
        return nLong;
    }
}

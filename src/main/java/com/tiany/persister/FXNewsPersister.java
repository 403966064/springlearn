package com.tiany.persister;

import com.tiany.basic.FXNewsBean;

public interface FXNewsPersister {

    void persisterNewsBean();

    FXNewsBean getNewsBean();
}

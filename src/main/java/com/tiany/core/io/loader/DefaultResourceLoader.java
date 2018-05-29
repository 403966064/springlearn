package com.tiany.core.io.loader;

import com.tiany.core.io.inputstream.Resource;
import org.springframework.util.Assert;

/**
 * Created by tiany on 2018/5/29.
 */
public class DefaultResourceLoader implements ResourceLoader {
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if(location.startsWith("/")){

        }
        return null;
    }
}

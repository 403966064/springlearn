package com.tiany.core.io.loader;

import com.tiany.core.io.inputstream.Resource;
import com.tiany.core.util.ResourceUtils;

/**
 * Created by tiany on 2018/5/29.
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;
    /**
     * 从当前路径的文件中获取到资源 Resource
     * @param location
     * @return
     */
    Resource getResource(String location);
}

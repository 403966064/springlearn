package com.tiany.core.io.support;

/**
 * Created by tiany on 2018/5/29.
 */

import org.springframework.core.io.ResourceLoader;

/**
 * 资源解析器
 */
public class ResourcePatternResolver {
    /**持有一个对ResourceLoader 的引用*/
    private final ResourceLoader resourceLoader;

    public ResourcePatternResolver(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}

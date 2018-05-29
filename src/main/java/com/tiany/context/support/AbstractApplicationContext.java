package com.tiany.context.support;

import com.tiany.core.io.support.ResourcePatternResolver;

/**
 * Created by tiany on 2018/5/29.
 */
public abstract class AbstractApplicationContext {
    /**需要一个资源解析器*/
    private ResourcePatternResolver resourcePatternResolver;

    public AbstractApplicationContext() {
    }

    public AbstractApplicationContext(ResourcePatternResolver resourcePatternResolver) {
        this.resourcePatternResolver = resourcePatternResolver;
    }
}

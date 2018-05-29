package com.tiany.core.io.inputstream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tiany on 2018/5/29.
 */
public interface InputStreamSource {

    /**
     * 获取输入流
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}

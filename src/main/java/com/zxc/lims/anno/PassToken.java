package com.zxc.lims.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description 用来跳过验证的PassToken
 * Author: zxc
 * Date: 2023/3/30 23:31
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PassToken {
  boolean required() default true;
}

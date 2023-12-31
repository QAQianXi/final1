package com.zxc.lims.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description 需要登录才能进行操作的注解UserLoginToken
 * Author: zxc
 * Date: 2023/3/30 23:32
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
  boolean required() default true;
}

package com.qinjun.autotest.tstest.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoTestData {
    String path() default "";
}

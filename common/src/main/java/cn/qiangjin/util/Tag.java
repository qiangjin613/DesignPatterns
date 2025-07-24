package cn.qiangjin.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:qiangjin613@163.com">qiangjin</a>
 */
@Target({ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Tag {

    Category category();
}

package cn.bugstack.types.annotations;

import java.lang.annotation.*;

/**
 * @description:TODO
 * @author: Lenovo
 * @create: 2024/9/21 下午3:06
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface RateLimiterAccessInterceptor {
    String key() default "all";

    double permitsPerSecond();

    double blacklistCount() default 0;

    String fallbackMethod();
}

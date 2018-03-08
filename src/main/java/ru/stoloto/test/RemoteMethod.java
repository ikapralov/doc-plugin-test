package ru.stoloto.test;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RemoteMethod {
}

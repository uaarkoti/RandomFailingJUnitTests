package com.cloudbees.test;

import java.lang.annotation.*;

/**
 * @author Udaypal Aarkoti
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Repeat {
  int value();
}

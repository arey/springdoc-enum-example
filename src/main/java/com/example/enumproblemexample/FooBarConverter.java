package com.example.enumproblemexample;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FooBarConverter implements Converter<String, FooBar> {

  @Override
  public FooBar convert(String source) {
    return FooBar.valueOf(fooBarToUpperCase(source));
  }

  private String fooBarToUpperCase(String source) {
    var upper = source.toUpperCase();
    return upper.replace("-", "_");
  }
}

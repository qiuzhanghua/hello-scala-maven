package com.github.qiuzhanghua;

public class HelloBean {
  private String message;

  public HelloBean(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "HelloBean{" +
        "message='" + message + '\'' +
        '}';
  }
}

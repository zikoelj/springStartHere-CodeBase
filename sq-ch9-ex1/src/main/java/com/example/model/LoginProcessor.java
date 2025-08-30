package com.example.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Component
@RequestScope
public class LoginProcessor {

  private String username;
  private String password;

  private final String id = UUID.randomUUID().toString();

  public boolean login() {
    String username = this.getUsername();
    String password = this.getPassword();

    if ("natalie".equals(username) && "password".equals(password)) {
      return true;
    } else {
      return false;
    }
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getId() {
    return id;
  }
}

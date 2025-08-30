package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.UUID;

@Service
@SessionScope
public class LoggedUserManagementService {

  private String username;
  private String id = UUID.randomUUID().toString();

  public String getUsername() {
    return username;
  }

  public String getId() {
    return id;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}

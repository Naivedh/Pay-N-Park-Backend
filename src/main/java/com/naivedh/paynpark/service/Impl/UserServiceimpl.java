package com.naivedh.paynpark.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService{
  @Override
  public UserDetailsService userDetailsService(){
    return new UserDetails();
  }

}

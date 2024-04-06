package com.naivedh.paynpark.service;

import com.naivedh.paynpark.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetails implements UserDetailsService {
  private UserRepository userRepository;
  @Override
  public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) {
    return userRepository.findByEmail(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }
}

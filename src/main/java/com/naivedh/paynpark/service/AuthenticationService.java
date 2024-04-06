package com.naivedh.paynpark.service;


import com.naivedh.paynpark.DTO.Request.SignInRequest;
import com.naivedh.paynpark.DTO.Request.SignUpRequest;
import com.naivedh.paynpark.DTO.Response.JwtAuthenticationResponse;

public interface AuthenticationService {
  JwtAuthenticationResponse signUp(SignUpRequest request);

  JwtAuthenticationResponse signIn(SignInRequest request);
}
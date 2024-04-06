package com.naivedh.paynpark.api;

import com.naivedh.paynpark.DTO.Request.SignInRequest;
import com.naivedh.paynpark.DTO.Request.SignUpRequest;
import com.naivedh.paynpark.DTO.Response.JwtAuthenticationResponse;
import com.naivedh.paynpark.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
  private final AuthenticationService authenticationService;
  @PostMapping("/signup")
  public ResponseEntity<JwtAuthenticationResponse> signUp(@RequestBody SignUpRequest request) {
    return ResponseEntity.ok(authenticationService.signUp(request));
  }

  @PostMapping("/signin")
  public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest request) {
    return ResponseEntity.ok(authenticationService.signIn(request));
  }
}
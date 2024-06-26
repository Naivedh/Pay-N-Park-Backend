package com.naivedh.paynpark.DTO.Request;

import com.naivedh.paynpark.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Role role;
}

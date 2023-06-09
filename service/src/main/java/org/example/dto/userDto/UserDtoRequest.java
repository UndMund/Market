package org.example.dto.userDto;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class UserDtoRequest {
    Long id;
    String username;
    String position;
    String email;
    String phoneNumber;
    BigDecimal money;
}

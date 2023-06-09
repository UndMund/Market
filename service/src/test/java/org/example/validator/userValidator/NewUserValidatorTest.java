package org.example.validator.userValidator;

import org.example.dto.userDto.UserDtoRegResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NewUserValidatorTest {

    @Test
    public void isValid() {
        List<String> positions = new ArrayList<>();
        positions.add("ADMIN");
        UserDtoRegResponse newUser = UserDtoRegResponse.builder()
                .userName("Nazar")
                .email("zavadskiy.nazar@mail.ru")
                .phoneNumber("+375336328517")
                .position("ADMIN")
                .password("Nazar17")
                .build();
        System.out.println(NewUserValidator.getInstance().isValid(newUser).getErrors());
        Assert.assertTrue(NewUserValidator.getInstance().isValid(newUser).isValid());
    }
}
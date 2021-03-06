package com.finance.homework.domain.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data @Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel
public class UserRequest {

    @ApiModelProperty(required = true, value = "User name", example = "John")
    @Size(min = 3, max = 50, message = "Firstname length should be min 3 and max 50 signs long.")
    @NotEmpty(message = "Firstname cannot be empty.")
    private String firstname;

    @ApiModelProperty(required = true, value = "User surname", example = "Dillinger")
    @Size(min = 3, max = 50, message = "Lastname length should be min 3 and max 50 signs long.")
    @NotEmpty(message = "Lastname cannot be empty.")
    private String lastname;

    @ApiModelProperty(required = true, value = "User access ", example = "Wall street 12")
    @Size(min = 3, max = 60, message = "Address length should be min 3 and max 60 signs long.")
    @NotEmpty(message = "Address cannot be empty.")
    private String address;

    @ApiModelProperty(required = true, value = "User email", example = "user123@gmail.com")
    @Email(message = "Email value doesn't fit into email regex pattern.")
    @NotEmpty(message = "Email cannot be empty.")
    private String email;

    @ApiModelProperty(required = true, value = "User phone", example = "3456783489")
    @Size(min = 7, max = 15, message = "Phone length should be min 7 and max 15 signs long.")
    @NotEmpty(message = "Phone cannot be empty.")
    private String phone;

}


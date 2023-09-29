package com.aimdevgroup.bookingapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_info")
@Getter
@Setter
public class UserInfoEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobile;
}

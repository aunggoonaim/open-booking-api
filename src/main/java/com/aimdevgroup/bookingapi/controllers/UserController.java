package com.aimdevgroup.bookingapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aimdevgroup.bookingapi.entities.UserInfoEntity;
import com.aimdevgroup.bookingapi.interfaces.IUserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping()
    @RequestMapping(path = "/save")
    public UserInfoEntity saveDepartment(@Valid @RequestBody UserInfoEntity department) {
        return userService.saveUserInfo(department);
    }

    @GetMapping()
    @RequestMapping(path = "/gets")
    public List<UserInfoEntity> fetchDepartmentList() {
        return userService.fetchUserInfoList();
    }

    @PutMapping()
    @RequestMapping(path = "/update/{id}")
    public UserInfoEntity updateDepartment(@RequestBody UserInfoEntity department,
            @PathVariable("id") Long departmentId) {
        return userService.updateUserInfo(department, departmentId);
    }

    @DeleteMapping()
    @RequestMapping(path = "/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        userService.deleteUserInfoById(departmentId);
        return "Deleted Successfully";
    }
}

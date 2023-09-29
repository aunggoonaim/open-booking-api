package com.aimdevgroup.bookingapi.interfaces;

import java.util.List;

import com.aimdevgroup.bookingapi.entities.UserInfoEntity;

public interface IUserService {
    UserInfoEntity saveUserInfo(UserInfoEntity userInfo);

    List<UserInfoEntity> fetchUserInfoList();

    UserInfoEntity updateUserInfo(UserInfoEntity userInfo, Long userInfoId);

    void deleteUserInfoById(Long userInfoId);
}

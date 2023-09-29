package com.aimdevgroup.bookingapi.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aimdevgroup.bookingapi.entities.UserInfoEntity;
import com.aimdevgroup.bookingapi.interfaces.IUserService;
import com.aimdevgroup.bookingapi.repositories.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfoEntity saveUserInfo(UserInfoEntity userInfo) {
        return userRepository.save(userInfo);
    }

    @Override
    public List<UserInfoEntity> fetchUserInfoList() {
        return (List<UserInfoEntity>) userRepository.findAll();
    }

    @Override
    public UserInfoEntity updateUserInfo(UserInfoEntity userInfo, Long userInfoId) {
        Optional<UserInfoEntity> userFind = userRepository.findById(userInfoId);

        if (userFind.isEmpty()) {
            return null;
        }

        UserInfoEntity userDB = userFind.get();

        if (Objects.nonNull(userInfo.getFirstName()) && !"".equalsIgnoreCase(userInfo.getFirstName())) {
            userDB.setFirstName(userInfo.getFirstName());
        }

        if (Objects.nonNull(userInfo.getLastName()) && !"".equalsIgnoreCase(userInfo.getLastName())) {
            userDB.setLastName(userInfo.getLastName());
        }

        return userRepository.save(userDB);
    }

    @Override
    public void deleteUserInfoById(Long userInfoId) {
        userRepository.deleteById(userInfoId);
    }
}

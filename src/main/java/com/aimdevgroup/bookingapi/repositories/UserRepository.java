package com.aimdevgroup.bookingapi.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.aimdevgroup.bookingapi.entities.UserInfoEntity;

@Repository
public interface UserRepository extends CrudRepository<UserInfoEntity, Long> {

}

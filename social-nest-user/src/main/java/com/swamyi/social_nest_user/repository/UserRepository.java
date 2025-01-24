package com.swamyi.social_nest_user.repository;

import com.swamyi.social_nest_user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

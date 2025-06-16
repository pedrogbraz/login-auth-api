package com.gontijo.login_auth_api.repository;

import com.gontijo.login_auth_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

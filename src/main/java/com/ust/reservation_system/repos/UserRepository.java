package com.ust.reservation_system.repos;

import com.ust.reservation_system.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

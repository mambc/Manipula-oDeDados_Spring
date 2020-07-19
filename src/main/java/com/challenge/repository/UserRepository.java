package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCandidatesIdAccelerationName(String accelerationName);
    List<User> findByCandidatesIdCompanyId(Long companyId);
}

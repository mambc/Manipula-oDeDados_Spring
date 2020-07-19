package com.challenge.repository;

import com.challenge.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
    //List<Challenge> findAllByAccelerationsIdAndSubmissionsIdUserId(Long accelerationId, Long submissionId);

    @Query("select distinct cha from Challenge cha " +
            " join cha.accelerations as acc " +
            " join acc.candidates can " +
            " join can.id.user user " +
            "where user.id = ?2 and acc.id = ?1")
    List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);
}

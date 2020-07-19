package com.challenge.service;

import com.challenge.entity.*;
import com.challenge.repository.CandidateRepository;
import com.challenge.service.interfaces.CandidateServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CandidateService implements CandidateServiceInterface {

    @Autowired
    private CandidateRepository repository;

    /*public CandidateService(CandidateRepository repository){
        this.repository = repository;
    }*/

    @Override
    public Optional<Candidate> findById(CandidateId id){
        return repository.findById(id);
    }

    @Override
    public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
        return repository.findByIdUserIdAndIdCompanyIdAndIdAccelerationId(userId, companyId, accelerationId);
    }

    @Override
    public List<Candidate> findByCompanyId(Long companyId) {
        return repository.findByIdCompanyId(companyId);
    }

    @Override
    public List<Candidate> findByAccelerationId(Long accelerationId) {
        return repository.findByIdAccelerationId(accelerationId);
    }

    @Override
    public Candidate save(Candidate object){
        return repository.save(object);
    }
}

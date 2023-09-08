package com.jendarey.jendareytech.repository;


import com.jendarey.jendareytech.model.Voter;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoterRepository extends MongoRepository<Voter, Long> {

/*
    @Query(value = "select devops_tools from voter",nativeQuery = true)
    public List<String> findAllDevops();
*/


}

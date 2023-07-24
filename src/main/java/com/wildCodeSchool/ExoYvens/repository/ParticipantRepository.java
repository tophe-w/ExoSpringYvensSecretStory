package com.wildCodeSchool.ExoYvens.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.wildCodeSchool.ExoYvens.entity.Participant;


public interface ParticipantRepository extends JpaRepository<Participant, Long> {

    
}
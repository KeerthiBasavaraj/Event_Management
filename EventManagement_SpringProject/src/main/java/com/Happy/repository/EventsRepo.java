package com.Happy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Happy.entity.EventsEntity;

import jakarta.transaction.Transactional;

@Transactional //committing or rolling back the transaction based on the success or failure of the transactional operation
public interface EventsRepo extends JpaRepository<EventsEntity, Integer> {

    boolean existsByEventCategory(String eventCategory);

    Optional<EventsEntity> findByEventCategory(String eventCategory); //userdefined method

    Optional<EventsEntity> findByEventId(int eventId); 

}

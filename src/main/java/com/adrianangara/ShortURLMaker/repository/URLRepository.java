package com.adrianangara.ShortURLMaker.repository;

import com.adrianangara.ShortURLMaker.entity.MappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends JpaRepository<MappingEntity, Long> {

    @Query("Select t From MappingEntity t where t.shortURL like ?1")
    MappingEntity findByShortURL(String shortURL);
}

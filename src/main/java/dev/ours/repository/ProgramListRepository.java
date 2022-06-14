package dev.ours.repository;

import dev.ours.model.ProgramList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramListRepository extends JpaRepository<ProgramList,Long> {

    List<ProgramList> findByStateNameStartingWith(String stateName);

    List<ProgramList> findByExperienceNameStartingWith(String experienceName);
}
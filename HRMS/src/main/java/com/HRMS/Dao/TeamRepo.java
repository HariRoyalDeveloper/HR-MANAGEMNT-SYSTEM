package com.HRMS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.Entity.Team;
@Repository
public interface TeamRepo extends  JpaRepository<Team, Integer> {

}

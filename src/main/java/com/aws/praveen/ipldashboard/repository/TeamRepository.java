package com.aws.praveen.ipldashboard.repository;

import com.aws.praveen.ipldashboard.data.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team getByTeamName(String teamName);
}

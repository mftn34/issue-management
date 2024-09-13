package com.furkant.issuemanagement.repository;

import com.furkant.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueRepository extends JpaRepository<Issue, Long> {

}

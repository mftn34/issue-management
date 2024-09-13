package com.furkant.issuemanagement.service;

import com.furkant.issuemanagement.dto.IssueHistoryDto;
import com.furkant.issuemanagement.entity.Issue;
import com.furkant.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    List<IssueHistoryDto> getByIssueId(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);

    void addHistory(Long id, Issue issue);
}

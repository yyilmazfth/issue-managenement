package indv.fth.springuyg.service;

import indv.fth.springuyg.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPagable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);

}

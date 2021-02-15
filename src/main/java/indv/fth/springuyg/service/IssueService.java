package indv.fth.springuyg.service;

import indv.fth.springuyg.dto.IssueDto;
import indv.fth.springuyg.entity.Issue;
import indv.fth.springuyg.entity.IssueHistory;
import indv.fth.springuyg.util.Tpage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    Tpage<IssueDto> getAllPagable(Pageable pageable);

    Boolean delete(IssueDto issue);

}

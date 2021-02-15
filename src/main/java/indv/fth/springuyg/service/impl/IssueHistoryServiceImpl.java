package indv.fth.springuyg.service.impl;

import indv.fth.springuyg.entity.IssueHistory;
import indv.fth.springuyg.repository.IssueHistoryRepository;
import indv.fth.springuyg.repository.IssueRepository;
import indv.fth.springuyg.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueRepository;

   public IssueHistoryServiceImpl(IssueHistoryRepository issueRepository){
       this.issueRepository=issueRepository;
   }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if(issueHistory.getDate()==null){
            throw new IllegalArgumentException("Issue Cannot be null");
        }
       issueHistory = issueRepository.save(issueHistory);
        return  issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPagable(Pageable pageable) {
        return issueRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
       issueRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}

package indv.fth.springuyg.service.impl;

import indv.fth.springuyg.dto.IssueDto;
import indv.fth.springuyg.entity.Issue;
import indv.fth.springuyg.repository.IssueRepository;
import indv.fth.springuyg.service.IssueService;
import indv.fth.springuyg.util.Tpage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if (issue.getDate() == null) {
            throw new IllegalArgumentException("Issue Date cannot be null");
        }
        Issue issueDb = modelMapper.map(issue, Issue.class);
        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public Tpage<IssueDto> getAllPagable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        Tpage page = new Tpage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }



    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}

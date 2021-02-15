package indv.fth.springuyg.service;

import indv.fth.springuyg.entity.IssueHistory;
import indv.fth.springuyg.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPagable(Pageable pageable);

    Boolean delete(Project project);

}

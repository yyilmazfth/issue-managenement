package indv.fth.springuyg.repository;

import indv.fth.springuyg.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {


}

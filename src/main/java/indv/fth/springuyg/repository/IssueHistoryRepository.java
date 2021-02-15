package indv.fth.springuyg.repository;

import indv.fth.springuyg.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}

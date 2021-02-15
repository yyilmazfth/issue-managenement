package indv.fth.springuyg.service;

import indv.fth.springuyg.entity.IssueHistory;
import indv.fth.springuyg.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPagable(Pageable pageable);

    Boolean delete(User user);

}

package indv.fth.springuyg.service.impl;

import indv.fth.springuyg.entity.User;
import indv.fth.springuyg.repository.UserRepository;
import indv.fth.springuyg.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        if(user.getEmail()==null){
            throw new IllegalArgumentException("username cannot be null");
        }
        return null;
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPagable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(User user) {

        return Boolean.TRUE;
    }
}

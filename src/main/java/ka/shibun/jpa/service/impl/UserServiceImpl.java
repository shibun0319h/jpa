package ka.shibun.jpa.service.impl;

import ka.shibun.jpa.domain.User;
import ka.shibun.jpa.repository.UserRepository;
import ka.shibun.jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
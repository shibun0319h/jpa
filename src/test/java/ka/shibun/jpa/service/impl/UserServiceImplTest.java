package ka.shibun.jpa.service.impl;

import ka.shibun.jpa.domain.User;
import ka.shibun.jpa.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void findByName() {
        User admain = userService.findByName("admain");
        List<User> all = userService.findAll();
    }
}
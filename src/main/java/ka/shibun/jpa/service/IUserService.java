package ka.shibun.jpa.service;

import ka.shibun.jpa.domain.User;

public interface IUserService extends IBaseService<User,Long>{
    User findByName(String name);
}

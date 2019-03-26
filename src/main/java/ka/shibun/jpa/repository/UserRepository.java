package ka.shibun.jpa.repository;

import ka.shibun.jpa.domain.User;

public interface UserRepository extends BaseRepository<User,Long>{

    User findByName(String name);
}

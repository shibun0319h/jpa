package ka.shibun.jpa.service;

import ka.shibun.jpa.query.BaseQuery;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T,ID extends Serializable> {
    //保存和修改
    void save(T t);
    //删除
    void delete(ID id);
    //查询单条
    T findOne(ID id);
    //查询所有
    List<T> findAll();
    //分页查询
    Page<T> findPageByQuery(BaseQuery baseQuery);
    //不带分页带条件的查询
    List<T> findByQuery(BaseQuery baseQuery);
    //根据jpql查询
    List findByJpql(String jpql,Object... values);
}
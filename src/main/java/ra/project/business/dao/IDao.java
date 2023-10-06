package ra.project.business.dao;

import java.util.List;

public interface IDao <T,E>{
    List<T> findAll();
    T  findById(E id);
    boolean create(T t);
    boolean update(T t);
    boolean delete(E id);
}

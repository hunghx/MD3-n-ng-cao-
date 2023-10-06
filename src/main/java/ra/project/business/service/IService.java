package ra.project.business.service;

import java.util.List;

public interface IService <T,E>{
    List<T> findAll();
    T  findById(E id);
    boolean create(T t);
    boolean update(T t);
    boolean delete(E id);
}

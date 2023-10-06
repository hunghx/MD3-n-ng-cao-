package ra.project.business.daoimpl;

import ra.project.business.dao.IEmployeeDao;
import ra.project.business.model.Employee;

import java.util.List;

public class EmployeeDao implements IEmployeeDao {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public boolean create(Employee employee) {
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Employee findByName(String name) {
        return null;
    }
}

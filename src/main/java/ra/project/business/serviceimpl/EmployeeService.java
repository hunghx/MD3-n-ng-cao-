package ra.project.business.serviceimpl;

import ra.project.business.dao.IEmployeeDao;
import ra.project.business.daoimpl.EmployeeDao;
import ra.project.business.model.Employee;
import ra.project.business.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeDao employeeDao = new EmployeeDao();
    @Override
    public Employee findByName(String name) {
        return employeeDao.findByName(name);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public boolean create(Employee employee) {
        return employeeDao.create(employee);
    }

    @Override
    public boolean update(Employee employee) {
        return employeeDao.update(employee);
    }

    @Override
    public boolean delete(Long id) {
        return employeeDao.delete(id);
    }
}

package ra.project.business.serviceimpl;

import ra.project.business.dao.IDepartmentDao;
import ra.project.business.daoimpl.DepartmentDao;
import ra.project.business.model.Department;
import ra.project.business.service.IDepartmentService;

import java.util.List;

public class DepartmentService implements IDepartmentService {
    private IDepartmentDao departmentDao = new DepartmentDao();
    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentDao.findById(id);
    }

    @Override
    public boolean create(Department department) {
        return departmentDao.create(department);
    }

    @Override
    public boolean update(Department department) {
        return departmentDao.update(department);
    }

    @Override
    public boolean delete(Long id) {
        return departmentDao.delete(id);
    }
}

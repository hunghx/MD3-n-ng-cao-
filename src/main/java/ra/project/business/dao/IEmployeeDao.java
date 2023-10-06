package ra.project.business.dao;

import ra.project.business.model.Employee;

public interface IEmployeeDao extends IDao<Employee,Long> {
    Employee findByName(String name);
}

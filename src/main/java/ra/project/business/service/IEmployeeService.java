package ra.project.business.service;

import ra.project.business.model.Employee;

public interface IEmployeeService extends IService<Employee,Long> {
    Employee findByName(String name);
}

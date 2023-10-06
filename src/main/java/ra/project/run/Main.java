package ra.project.run;

import ra.project.business.model.Department;
import ra.project.business.service.IDepartmentService;
import ra.project.business.serviceimpl.DepartmentService;

import java.util.List;

public class Main {
    public  static final IDepartmentService departmentService = new DepartmentService();
    public static void main(String[] args) {

        List<Department> list = departmentService.findAll();
        for (Department d:list
             ) {
            System.out.println(d);
        }

        // thêm mới
        Department newDepartment = new Department();
        newDepartment.setName("Truyền Thông");
        departmentService.create(newDepartment);
         list = departmentService.findAll();
        for (Department d:list
        ) {
            System.out.println(d);
        }
    }
}

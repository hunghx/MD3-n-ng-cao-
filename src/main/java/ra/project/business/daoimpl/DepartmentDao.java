package ra.project.business.daoimpl;

import ra.project.business.config.ConnectDB;
import ra.project.business.dao.IDepartmentDao;
import ra.project.business.model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao implements IDepartmentDao {
    @Override
    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        Connection con= ConnectDB.getConnection();
        try {
            PreparedStatement pre = con.prepareStatement("Select * from department");
            ResultSet rs = pre.executeQuery();
            while (rs.next()){
                Department department = new Department();
                department.setId(rs.getLong("id"));
                department.setName(rs.getString("name"));
                list.add(department);
            }
            ConnectDB.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public boolean create(Department department) {
        Connection con= ConnectDB.getConnection();
        try {
            PreparedStatement pre = con.prepareStatement("Insert Into department(name) values (?)");
            pre.setString(1,department.getName());
            pre.executeUpdate();
            ConnectDB.closeConnection(con);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Department department) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}

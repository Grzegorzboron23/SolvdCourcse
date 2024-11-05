package OnlineMarket.Employees;

import OnlineMarket.Info.AddressInfo;
import OnlineMarket.Info.EmployeeInfo;

public class Employee {
    private int id;
    private EmployeeInfo employeesInfo;
    private AddressInfo addressInfo;


    public Employee(int id, EmployeeInfo employeesInfo, AddressInfo addressInfo) {
        this.id = id;
        this.employeesInfo = employeesInfo;
        this.addressInfo = addressInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeInfo getEmployeesInfo() {
        return employeesInfo;
    }

    public void setEmployeesInfo(EmployeeInfo employeesInfo) {
        this.employeesInfo = employeesInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }
}


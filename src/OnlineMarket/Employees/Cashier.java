package OnlineMarket.Employees;

import OnlineMarket.Info.AddressInfo;
import OnlineMarket.Info.EmployeeInfo;

public class Cashier extends Employee {
    private int registerNumber;

    public Cashier(int id, EmployeeInfo employeesInfo, AddressInfo addressInfo, int registerNumber) {
        super(id, employeesInfo, addressInfo);
        this.registerNumber = registerNumber;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

}

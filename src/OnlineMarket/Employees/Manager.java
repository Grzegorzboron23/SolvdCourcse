package OnlineMarket.Employees;


import OnlineMarket.Info.AddressInfo;
import OnlineMarket.Info.EmployeeInfo;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int id, EmployeeInfo employeesInfo, AddressInfo addressInfo, int teamSize) {
        super(id, employeesInfo, addressInfo);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

}


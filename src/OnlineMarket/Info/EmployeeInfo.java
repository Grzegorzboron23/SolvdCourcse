package OnlineMarket.Info;

import OnlineMarket.Enums.Position;

import java.time.LocalDate;

public class EmployeeInfo {
    private Float salary;
    private LocalDate hireDate;
    private Position position;

    public EmployeeInfo(Float salary, LocalDate hireDate, Position position) {
        this.salary = salary;
        this.hireDate = hireDate;
        this.position = position;
    }

    public EmployeeInfo() {
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}

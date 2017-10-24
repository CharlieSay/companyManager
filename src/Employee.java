public class Employee {

    private employeeType eT;
    private String name;
    private Double payRate;
    private Double uniqueEMPLOYEEIDENTIFIER;

    public Employee(employeeType ePassed, String namePassed) {
        this.eT = ePassed;
        this.name = namePassed;
        switch (ePassed){
            case HOURLY_EMPLOYEE:
                payRate = 8.20;
                break;
            case SALARIED_EMPLOYEE:
                payRate = 25.00;
                break;
            case MANAGER:
                payRate = 50.12;
                break;
            case EXECUTIVE:
                payRate = 110.21;
                break;
        }
    }

    public employeeType getEmployeeType() {
        return eT;
    }

    public String getName(){
        return name;
    }

    public Double getPayRate(){
        return payRate;
    }

    public void setLevel(employeeType eT){
        this.eT = eT;
    }

    public Employee EmployeeReturn(){
        return this;
    }
}

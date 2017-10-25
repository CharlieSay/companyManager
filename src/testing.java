import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testing{

    @Test
    public void testForEmployeeLevel(){
     Employee em = new Employee(employeeType.EXECUTIVE,"Dave");
        Assert.assertEquals(employeeType.EXECUTIVE,em.getEmployeeType());
     Assert.assertEquals("Dave",em.getName());
    }

    @Test
    public void testForPayRateExecutive(){
        Employee em = new Employee(employeeType.EXECUTIVE,"Dave");
        assertEquals(java.util.Optional.of(110.21),java.util.Optional.of(em.getPayRate()));
    }

    @Test
    public void testForMultipleEmployeesSameLevel(){
        Company Company = new Company();
        Company.newEmployee(employeeType.EXECUTIVE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.getEmployeeTable();
    }

    @Test
    public void testForEmployeesAll4Levels(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Sarah");
        Company.newEmployee(employeeType.MANAGER,"Joelan");
        Company.getEmployeeTable();
    }


    @Test
    public void testGettingSpecificEmployeeName(){
        Company Company = new Company();
        Company.newEmployee(employeeType.EXECUTIVE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Assert.assertEquals("Dave",Company.getSpecificEmployee("Dave").getName());
    }

    @Test
    public void testGettingMultipleEmployeeName(){
        Company Company = new Company();
        Company.newEmployee(employeeType.EXECUTIVE,"Dave");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Ralph");
        Assert.assertEquals("Dave",Company.getSpecificEmployee("Dave").getName());
        Assert.assertEquals("Ralph",Company.getSpecificEmployee("Ralph").getName());
    }

    @Test
    public void testGettingMultipleEmployeeLevels(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Sarah");
        Company.newEmployee(employeeType.MANAGER,"Joelan");
        Assert.assertEquals(employeeType.HOURLY_EMPLOYEE,Company.getSpecificEmployee("Dave").getEmployeeType());
        Assert.assertEquals(employeeType.EXECUTIVE,Company.getSpecificEmployee("Ralph").getEmployeeType());
    }

    @Test
    public void testHireThenFireSomeone(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.getEmployeeTable();
        Company.fireEmployee("Dave");
        Company.getEmployeeTable();
    }

    @Test
    public void fireSomeoneWhoDoesntExist(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        assertEquals(false,Company.fireEmployee("Bob"));
    }


    @Test
    public void getAEmployeeStatus(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.getFormattedEmployee("Ralph");
        Company.getFormattedEmployee("Dave");
    }

    @Test
    public void raiseMultipleEmployeeLevels(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Steph");
        Company.newEmployee(employeeType.MANAGER,"Joanne");
        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Dave"), employeeType.SALARIED_EMPLOYEE));
        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Steph"), employeeType.MANAGER));
        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Joanne"), employeeType.EXECUTIVE));
    }

    @Test
    public void raiseEmployeeLevelToEqual(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Employee e = Company.getSpecificEmployee("Dave");
        System.out.println("Current Role : "+e.getEmployeeType());
        Assert.assertEquals(false,Company.raiseEmployee(Company.getSpecificEmployee("Dave"), employeeType.HOURLY_EMPLOYEE));
    }

    @Test
    public void uniqueIDTest1(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Steph");
        Company.newEmployee(employeeType.MANAGER,"Joanne");
        Assert.assertEquals(1,Company.getSpecificEmployee("Dave").getUniqueEMPLOYEEIDENTIFIER());
    }

    @Test
    public void uniqueIDTestMoreThanOne() {
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLY_EMPLOYEE, "Dave");
        Company.newEmployee(employeeType.SALARIED_EMPLOYEE, "Steph");
        Company.newEmployee(employeeType.MANAGER, "Joanne");
        Company.getEmployeeTable();
        Assert.assertEquals(1, Company.getSpecificEmployee("Dave").getUniqueEMPLOYEEIDENTIFIER());
    }

}

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testing{

    @Test
    public void testForEmployeeLevel(){
     Employee em = new Employee(employeeType.EXECUTIVE,"Dave");
        assertEquals(employeeType.EXECUTIVE,em.getEmployeeType());
     assertEquals("Dave",em.getName());
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
        Company.newEmployee(employeeType.HOURLYEMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.newEmployee(employeeType.SALARIEDEMPLOYEE,"Sarah");
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
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Assert.assertEquals("Dave",Company.getSpecificEmployee("Dave").getName());
        Assert.assertEquals("Ralph",Company.getSpecificEmployee("Ralph").getName());
    }

    @Test
    public void testGettingMultipleEmployeeLevels(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLYEMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.newEmployee(employeeType.SALARIEDEMPLOYEE,"Sarah");
        Company.newEmployee(employeeType.MANAGER,"Joelan");
        Assert.assertEquals(employeeType.HOURLYEMPLOYEE,Company.getSpecificEmployee("Dave").getEmployeeType());
        Assert.assertEquals(employeeType.EXECUTIVE,Company.getSpecificEmployee("Ralph").getEmployeeType());
    }

    @Test
    public void testHireThenFireSomeone(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLYEMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.getEmployeeTable();
        Company.fireEmployee("Dave");
        Company.getEmployeeTable();
    }

    @Test
    public void getAEmployeeStatus(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLYEMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.getFormattedEmployee("Ralph");
        Company.getFormattedEmployee("Dave");
    }

    @Test
    public void raiseEmployeeLevel(){
        Company Company = new Company();
        Company.newEmployee(employeeType.HOURLYEMPLOYEE,"Dave");
        Company.newEmployee(employeeType.EXECUTIVE,"Ralph");
        Company.newEmployee(employeeType.SALARIEDEMPLOYEE,"Sarah");
        Company.newEmployee(employeeType.MANAGER,"Joelan");
        Employee e = Company.getSpecificEmployee("Dave");
        System.out.println("Current Role : "+e.getEmployeeType());
        assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Dave"),employeeType.SALARIEDEMPLOYEE));
    }
}

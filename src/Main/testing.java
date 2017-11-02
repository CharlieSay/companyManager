package Main;

import employeeS.EmployeeMaster;
import employeeS.ExecutiveEmployee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testing{

//    @Test
//    public void testForEmployeeLevel(){
//     Employee em = new Employee(employeeType.EXECUTIVE,"Dave","Smith");
//     Assert.assertEquals(employeeType.EXECUTIVE,em.getEmployeeType());
//     Assert.assertEquals("Dave",em.getFirstName());
//    }
//
//    @Test
//    public void testForPayRateExecutive(){
//        Employee em = new Employee(employeeType.EXECUTIVE,"Dave","Smith");
//        assertEquals(java.util.Optional.of(110.21),java.util.Optional.of(em.getPayRate()));
//    }
//
//    @Test
//    public void testForMultipleEmployeesSameLevel(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.EXECUTIVE,"Dave","Smith");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        Company.getEmployeeTable();
//    }
//
//    @Test
//    public void testForEmployeesAll4Levels(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Smith");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Sarah","Kmputu");
//        Company.newEmployee(employeeType.MANAGER,"Joelan","Warring");
//        Company.getEmployeeTable();
//    }
//
//
//    @Test
//    public void testGettingSpecificEmployeeName(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.EXECUTIVE,"Dave","Ralph");
//        Assert.assertEquals("Dave",Company.getSpecificEmployee("Dave").getFirstName());
//    }
//
//    @Test
//    public void testGettingMultipleEmployeeName(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.EXECUTIVE,"Dave","Ralph");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Ralph","Barrett");
//        Assert.assertEquals("Dave",Company.getSpecificEmployee("Dave").getFirstName());
//        Assert.assertEquals("Ralph",Company.getSpecificEmployee("Ralph").getFirstName());
//    }
//
//    @Test
//    public void testGettingMultipleEmployeeLevels(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Sarah","Kumputu");
//        Company.newEmployee(employeeType.MANAGER,"Joelan","Warring");
//        Assert.assertEquals(employeeType.HOURLY_EMPLOYEE,Company.getSpecificEmployee("Dave").getEmployeeType());
//        Assert.assertEquals(employeeType.EXECUTIVE,Company.getSpecificEmployee("Ralph").getEmployeeType());
//    }
//
//    @Test
//    public void testHireThenFireSomeone(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        Company.getEmployeeTable();
//        Company.fireEmployee("Dave");
//        Company.getEmployeeTable();
//    }
//
//    @Test
//    public void fireSomeoneWhoDoesntExist(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        assertEquals(false,Company.fireEmployee("Bob"));
//    }
//
//
//    @Test
//    public void getAEmployeeStatus(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Company.newEmployee(employeeType.EXECUTIVE,"Ralph","Barrett");
//        Company.getFormattedEmployee("Ralph");
//        Company.getFormattedEmployee("Dave");
//    }
//
//    @Test
//    public void raiseMultipleEmployeeLevels(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Steph","Kmputu");
//        Company.newEmployee(employeeType.MANAGER,"Joanne","Warring");
//        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Dave"), employeeType.SALARIED_EMPLOYEE));
//        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Steph"), employeeType.MANAGER));
//        Assert.assertEquals(true,Company.raiseEmployee(Company.getSpecificEmployee("Joanne"), employeeType.EXECUTIVE));
//    }
//
//    @Test
//    public void raiseEmployeeLevelToEqual(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Ralph");
//        Employee e = Company.getSpecificEmployee("Dave");
//        System.out.println("Current Role : "+e.getEmployeeType());
//        Assert.assertEquals(false,Company.raiseEmployee(Company.getSpecificEmployee("Dave"), employeeType.HOURLY_EMPLOYEE));
//    }
//
//    @Test
//    public void uniqueIDTest1(){
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Strafford");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Steph","Trader");
//        Company.newEmployee(employeeType.MANAGER,"Joanne","IdentifyMeBoy");
//        Assert.assertEquals(1,Company.getSpecificEmployee("Dave").getUniqueEMPLOYEEIDENTIFIER());
//    }
//
//    @Test
//    public void uniqueIDTestMoreThanOne() {
//        Company Company = new Company();
//        Company.newEmployee(employeeType.HOURLY_EMPLOYEE,"Dave","Strafford");
//        Company.newEmployee(employeeType.SALARIED_EMPLOYEE,"Steph","Trader");
//        Company.newEmployee(employeeType.MANAGER,"Joanne","IdentifyMeBoy");
//        Company.getEmployeeTable();
//        Assert.assertEquals(1, Company.getSpecificEmployee("Dave").getUniqueEMPLOYEEIDENTIFIER());
//    }

    @Test
    public void testForStartDate(){
        ExecutiveEmployee dave = new ExecutiveEmployee("Dave","Strafford",
                EmployeeMaster.employeeType.MANAGER,EmployeeMaster.employeeRata.HOURLY,29);
        dave.startDate();
    }

}

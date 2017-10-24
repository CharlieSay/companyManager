public enum employeeType {

    HOURLY_EMPLOYEE,
    SALARIED_EMPLOYEE,
    MANAGER,
    EXECUTIVE;

    public int getLevel(employeeType et){
        if (et == employeeType.EXECUTIVE){
            return 4;
        }else if (et == employeeType.MANAGER){
            return 3;
        }else if (et == employeeType.SALARIED_EMPLOYEE){
            return 2;
        }else if (et == employeeType.HOURLY_EMPLOYEE){
            return 1;
        }else{
            return 0;
        }
    }

}

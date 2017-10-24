public enum employeeType {

    HOURLYEMPLOYEE,
    SALARIEDEMPLOYEE,
    MANAGER,
    EXECUTIVE;

    public int getLevel(employeeType et){
        if (et == employeeType.EXECUTIVE){
            return 4;
        }else if (et == employeeType.MANAGER){
            return 3;
        }else if (et == employeeType.SALARIEDEMPLOYEE){
            return 2;
        }else if (et == employeeType.HOURLYEMPLOYEE){
            return 1;
        }else{
            return 0;
        }
    }

}

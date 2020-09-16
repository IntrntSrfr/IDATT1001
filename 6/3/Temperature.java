public class Temperature {
    int[][] temps ;

    public Temperature(){
        temps= new int[30][24];
    }

    public int[][] getMonth(){
        return temps;
    }

    public int[] getDay(int day){
        return temps[day];
    }

    public int getHour(int day, int hour){
        return temps[day][hour];
    }

    
}

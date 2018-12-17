
public class TaskOne {
public static void main(String[] args){
	int sec = 4_500;
	int min = sec/60;
	int secRest = sec%60;
	int hour = sec/3600;
	int day =  sec/86400;
	int week = sec/604800;
	System.out.println( sec + " Seconds is: ");
	System.out.println( "A)"+ min + " full minutes and " + secRest + " seconds. ");
	System.out.println( "B)"+hour+" full hour/s and "+min + " full minutes and " + secRest + " seconds. ");
	System.out.println( "C)"+day+" full day/s and " +hour+" full hour/s and "+min + " full minutes and " + secRest + " seconds. ");
	System.out.println( "D)" +week+" full week/s " +day+" full day/s " +hour+" full hour/s and "+min + " full minutes and " + secRest + " seconds. ");
	
	
	System.out.println ("OK");
}
}

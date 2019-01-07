import java.util.Random;

public class HM_4 {
	public static void main (String [] args) {
	int[] mas = new int[10];
	Random rand = new Random ();
	
	for(int i = 0; i < mas.length; i++)
		mas[i] = rand.nextInt(10);
	
	for (int i = 0; i< mas.length; i++){
		System.out.print(mas[i] + " ");
		
		}
	System.out.println( "1-я оценка "+ mas[0]);
	System.out.println("10-я оценка " + mas[9]);
	int max = 0;
	int index = 0;
	for (int i = 0; i < mas.length; i++)
	{
		if (max < mas[i]){
			max = mas[i];
			index = i;
			}
		
	}
	System.out.println("Максимальная оценка " + index + " "+ max);
	}
	
	
}

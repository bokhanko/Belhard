import java.util.Random;

public class HM_6 {
	public static void main (String [] args) {
	int[] m = new int[10];
	Random rand = new Random ();
	
	for(int i = 0; i < m.length; i++)
		m[i] = rand.nextInt(10);
	
	for (int i = 0; i< m.length; i++){
		System.out.print( m[i] + " ");
		
		}
	int indexMin = 0;
    int indexMax = 0;
    int sum = 0;
    int i = 0;
    while (i < m.length)
    {
        if (m[i] < m[indexMin])
            indexMin = i;
        
        if (m[i] > m[indexMax])
            indexMax = i;
        i++;
    }
    if (indexMin < indexMax)
    {
        for (int j = indexMin; j <= indexMax; j++)
            sum = sum + m[j];
    } else
    {
        for (int j = indexMin; j >= indexMax; j--)
            sum = sum + m[j];
    }
System.out.println (" THE Sum=" + sum);
	}
	
	
}

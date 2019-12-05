//Montan Lopez Erick Alfonso A01379766
public class Insertsort {
	public void insertSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int temp = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > temp) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = temp; 
        } 
    } 
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
	public static void main(String[] args) throws InterruptedException {
		
		int arr[] = { 12, 11, 13, 5, 6 ,4,2}; 
		  
        Insertsort ob = new Insertsort(); 
        ob.insertSort(arr); 
  
        printArray(arr); 
        
        long inicio = System.currentTimeMillis();
         
        Thread.sleep(2000);
         
        long fin = System.currentTimeMillis();
         
        double tiempo = (double) ((fin - inicio)/1000);
         
        System.out.println(tiempo +" segundos");
         
    }
}/*
Time: 2 seconds.
Time Complexity: O(n*2)

Auxiliary Space: O(1)

Stable: Yes
 this reduce the number of comparsions 






*/

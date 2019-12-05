

import java.util.Random;
import java.util.Scanner;

public class CompareSorts {
	

	public static void main(String[] args) {
		boolean b = true;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int [] a = new int [50000];
		for(int x=0; x<50000; x++) {
			int ra = rand.nextInt(50000);
			a[x] = ra;
		}
		while(b== true) {
			System.out.println("1,2,3,4");
			int o = sc.nextInt();
			if(o==1) {
				bubbleSort(a);
				System.out.println("1");
			}
			else if(o==2) {
				insertion(a);
				System.out.println("1");
			}
			else if(o==3) {
				mergeSort(a,0,a.length-1);
				System.out.println("1");
			}
			else {
				b = false;
			}
		}
	}
	
	public static void mergeSort(int a[], int lowerB, int higherB){
	    int mid;
	    if(lowerB < higherB) {
	        mid = lowerB + (higherB - lowerB) / 2;
	        mergeSort(a, lowerB, mid);
	        mergeSort(a, mid+1, higherB);
	        merge(a, lowerB, mid, higherB);
	    }
	}

	public static void merge(int a[], int lowerB, int mid, int higherB){
	    int b[] = new int[a.length]; 
	    for(int x = 0; x<a.length; x++) {
	    	b[x]=a[x];
	    }
	    int i, j, k;
	    i = lowerB;
	    j = mid + 1;
	    k = lowerB;
	    /*System.out.println("high: " + higherB);
    	System.out.println("low: " + lowerB);
    	System.out.println("mid: " + mid);*/
	    while(i <= mid && j <= higherB){
	    	/*System.out.println("k: " + k);
        	System.out.println("i: " + i);
        	System.out.println("j: " + j);*/
	        if(b[i] <= b[j]){
	            a[k] = b[i];
	            i++;
	        }
	        else{
	            a[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while(i <= mid) {
	        a[k] = b[i];
	        i++;
	        k++;
	    }
	}


	public static int[] bubbleSort(int [] a) {
		boolean cambio;
		int aux;
		for(int x=0;x<a.length-1;x++) {	
			cambio=false;
			for(int y=0;y<a.length-1-x;y++) {
				if (a[y]>a[y+1]) {
					aux = a[y+1];
					a[y+1]=a[y];
					a[y]= aux;
					cambio = true;
				}
			}
			if(!cambio) {
				break;
			}
		}
		return a;
		
	}
	
	public static int[] insertion(int [] a) {
		int n = a.length;
        for (int i=1; i<n; ++i){
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j] > key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
        return a;
	}
}
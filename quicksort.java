public class Quick  
    {  
         
    int partition (int a[], int start, int end)  
    {  
        int pivot = a[end];  
        int i = (start - 1);  
      
        for (int j = start; j <= end - 1; j++)  
        {  
              
            if (a[j] < pivot)  
            {  
                i++;  
                int z = a[i];  
                a[i] = a[j];  
                a[j] = z;  
            }  
        }  
        int t = a[i+1];  
        a[i+1] = a[end];  
        a[end] = t;  
        return (i + 1);  
    }  
      
     
    void quick(int a[], int start, int end)  
    {  
        if (start < end)  
        {  
            int p = partition(a, start, end);  //p is partitioning index  
            quick(a, start, p - 1);  
            quick(a, p + 1, end);  
        }  
    }  
      
     
    void printArr(int a[], int n)  
    {  
        int x;  
        for (x = 0; x < n; x++)  
            System.out.print(a[x] + " ");  
    }  
        public static void main(String[] args) {  
        int a[] = { 13, 18, 27, 2, 19, 25 };  
        int n = a.length;  
        System.out.println("\nBefore sorting array elements are - ");  
        Quick q1 = new Quick();  
        q1.printArr(a, n);  
        q1.quick(a, 0, n - 1);  
        System.out.println("\nAfter sorting array elements are - ");  
        q1.printArr(a, n);  
        System.out.println();  
        }  
    }

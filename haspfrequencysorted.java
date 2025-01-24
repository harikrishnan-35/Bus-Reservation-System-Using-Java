package busres;

public class haspfrequencysorted {
    public static void main(String[] args)
    {
        int arr[] = {1,2,8,2,8,8};
        int[] heap = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            heap[arr[i]]++;
        }
        System.out.println(heap[8]);  
      }
    
}

package assignment4;

public class Sortarray {
	public static void sort()
	{
		int i;
	int arr[]= {1,1,1,1,0,0,1,0};
	int n = arr.length;
    for ( i = 0; i < n-1; i++)
    {
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (arr[j] < arr[min_idx])
            {  min_idx = j;
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;}
    }
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sort();
	}

}

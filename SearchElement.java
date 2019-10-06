class SearchElement{
   
   static int searchInSorted(int arr[], int n, int x)
    {
        
		return doBinarySearch(arr,n,x,0,n-1);
        
    }
   static int doBinarySearch(int arr[], int n, int x,int low,int high)
    {
        if(low > high)
        {
            return -1;
        }
        
        int middleIndex =  low + (high-low)/2;
        
        if(arr[middleIndex] == x)
        {
            return 1;
        }
        else if(arr[middleIndex] < x)
        {
           return  doBinarySearch(arr,n,x,middleIndex+1,high);
        }
        else
        {
            return doBinarySearch(arr,n,x,low,middleIndex-1);
        }
        
    }
}

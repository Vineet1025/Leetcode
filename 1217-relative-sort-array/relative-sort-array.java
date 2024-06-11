class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         int trav = 0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    int temp = arr1[j];
                    arr1[j] = arr1[trav];
                    arr1[trav++] = temp; 
                }
            }
        }
        int[] arr = new int[arr1.length - trav];
        int count = 0;
        for(int i=trav;i<arr1.length;i++){
            arr[count++] = arr1[i];
        }
        Arrays.sort(arr);
        count=0;
        for(int i=trav;i<arr1.length;i++){
            arr1[i] = arr[count++];
        }

    return arr1; 
    }
}
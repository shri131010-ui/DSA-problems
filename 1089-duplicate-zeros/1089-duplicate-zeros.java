class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZerores = 0;
        int lastIdx = arr.length - 1;

        for(int i = 0; i<= lastIdx - possibleZerores; i++ ){
            if(arr[i] == 0){
                if(i == lastIdx - possibleZerores){
                    arr[lastIdx] = 0;
                    lastIdx -= 1;
                    break;
                }
                possibleZerores++;
            }
        }
        int newLastIdx = lastIdx - possibleZerores;
        for(int i= newLastIdx; i>= 0; i--){
            if(arr[i] == 0){
                arr[i +possibleZerores] = 0;
                possibleZerores--;
                arr[i + possibleZerores] = 0;
            }
            else{
                arr[i + possibleZerores] = arr[i];
            }
        }
    }
}
public class Recitation8 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList) {
        int track = 0;
        while (track < hopList.length - 1) {
            if (hopList[track] == 0) break;
            track += hopList[track];
        }
        return track == hopList.length - 1; // replace this line with your code
    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        int[] arr = new int[numberList.length + 1];
        int start = 0 , end = start + (windowSize -1), index = 0;
        while(end < numberList.length){
            int smallestNum = numberList[start];
            for(int i = start; i <= end; i++){
                if(smallestNum > numberList[i]) smallestNum = numberList[i];
            }
            arr[index] = smallestNum;
            index++;
            start++;
            end++;
        }
        int[] ans = new int[index];
        System.arraycopy(arr,0,ans,0,ans.length);
        return ans; // replace this line with your code
    }
}

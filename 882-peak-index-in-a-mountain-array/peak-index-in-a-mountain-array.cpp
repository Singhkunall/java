class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int n = arr.size();
        int left = 1; 
        int right = n - 2;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }if(arr[mid-1]>arr[mid]){
                right = mid - 1;

            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
};
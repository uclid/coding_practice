/*
Note that this is not a class and only the solution function has been provided below.
Q: Find the kth largest element in an unsorted array. This will be the kth largest element in sorted order, not the kth distinct element.
*/

int solution(int[] nums, int k) {
    
    //this acts as a min heap, reverseOrder makes max heap
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i: nums){
        pq.add(i);
    }
    
    int sol = 0;
    for(int i = 0; i < k; i++){
        sol = pq.poll();
    }
    
    return sol;

}

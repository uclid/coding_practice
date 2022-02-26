/*
Note that this is not a class and only the solution function has been provided below.
Q: Given a singly linked list of integers, determine whether or not it's a palindrome.
*/

// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean solution(ListNode<Integer> l) {
    
    //O(n) space complexity with arraylist
    /*O(1) can be achieved by reversing second
        half of the linked list in place
        and comparing first half with second
    */
    
    ListNode<Integer> curr = l;
    ArrayList<Integer> arr_list = new ArrayList<>();
    
    while(curr != null){
        
        arr_list.add(curr.value);
        curr = curr.next;
        
    }
    
    int start = 0;
    int end = arr_list.size() - 1;
    
    
    while(start < end){
        
        if(arr_list.get(start) - arr_list.get(end) != 0){
            return false;
        }
        
        start++;
        end--;
        
    }
    
    return true;
}

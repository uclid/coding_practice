/*
Note that this is not a class and only the solution function has been provided below.
Q: Given a singly linked list of integers l and an integer k, remove all elements from 
list l that have a value equal to k.
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
ListNode<Integer> solution(ListNode<Integer> l, int k) {
    
    ListNode<Integer> prev = null;
    ListNode<Integer> curr = l;
    ListNode<Integer> head = curr;
    
    while(curr != null){
        
        if(curr.value == k){
            if(prev == null){
                head = head.next;
            }
            else{
                prev.next = curr.next;
            }
        }else{
            prev = curr;
        }
        
        curr = curr.next;
    }    
    
    return head;
}

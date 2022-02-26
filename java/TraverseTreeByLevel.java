/*
Note that this is not a class and only the solution function has been provided below.
Q: Given a binary tree of integers t, return its node values in the following format:
    The first element should be the value of the tree root;
    The next elements should be the values of the nodes at height 1 (i.e. the root children), ordered from the leftmost to the rightmost one;
    The elements after that should be the values of the nodes at height 2 (i.e. the children of the nodes at height 1) ordered in the same way;
    ...
*/

//
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
ArrayList<Integer> solution(Tree<Integer> t) {
    
    //BFS traversal is performed
    ArrayList<Tree<Integer>> q = new ArrayList<Tree<Integer>>();
    q.add(t);
    
    ArrayList<Integer> sol = new ArrayList<Integer>();
    while(q.size() > 0){
        Tree<Integer> temp = q.get(0);
        if(temp != null){
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            sol.add(temp.value);
        }
        
        q.remove(temp);
    }
    
    //System.out.print(sol);
    
    return sol;
}

/*
Note that this is not a class and only the solution function has been provided below.
Q: You have a binary tree t. Your task is to find the largest value in each row of 
this tree. In a tree, a row is a set of nodes that have equal depth.
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
    
    //BFS traversal is useful for level order traversal
    ArrayList<Tree<Integer>> q = new ArrayList<Tree<Integer>>();
    q.add(t);
    
    ArrayList<Integer> sol = new ArrayList<Integer>();
    while(q.size() > 0){
        int level_size = q.size();
        ArrayList<Integer> level_items = new ArrayList<Integer>();
        while(level_size > 0){
            Tree<Integer> temp = q.get(0);
            if(temp != null){
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                level_items.add(temp.value);
            }
            q.remove(temp);
            level_size--;
        }
        if(level_items.size() > 0){
            sol.add(Collections.max(level_items));
            level_items.clear();
        }
        
    }
    
    //System.out.print(sol);
    
    return sol;
    
}

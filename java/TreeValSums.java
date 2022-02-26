/*
Note that this is not a class and only the solution function has been provided below.
Q: We're going to store numbers in a tree. Each node in this tree will store a single 
digit (from 0 to 9), and each path from root to leaf encodes a non-negative integer.
Given a binary tree t, find the sum of all the numbers encoded in it.
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

String treeSum(Tree<Integer> t, String paths){
    
    if(t == null){
        return paths;
    }
    
    if(t.left == null){
        return treeSum(t.right, paths + "" + t.value);
    }else if(t.right == null){
        return treeSum(t.left, paths + "" + t.value);
    }else{
        return treeSum(t.left, paths + "" + t.value) +  " " + treeSum(t.right, paths + "" + t.value);
    }
    
}

long solution(Tree<Integer> t) {
    
    String paths = treeSum(t,"");
    
    if(paths == ""){
        return 0;
    }
    
    String[] split_paths = paths.split(" ");
    //System.out.println(Arrays.toString(split_paths));
    
    long total = 0;
    for(String path: split_paths){
        
        total += Long.valueOf(path);
        
    }
    
    return total;

}

/*
Note that this is not a class and only the solution function has been provided below.
Q: Given an absolute file path (Unix-style), shorten it to the format /<dir1>/<dir2>/<dir3>/....
*/

String solution(String path) {
    
    Stack<String> stack = new Stack<>();

    for (String s : path.split("/")) {
        if ("..".equals(s)) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else if (!s.isEmpty() && !".".equals(s)) {
            stack.push(s);
        }
    }
    
    String shortened = "";
    while(stack.size() > 0){
        String dir = stack.pop();
        shortened = "/" + dir + shortened;
    }
    
    shortened = shortened.equals("")? "/": shortened;
    
    System.out.println(shortened);
    
    return shortened;

}

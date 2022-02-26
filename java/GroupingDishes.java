/*
Note that this is not a class and only the solution function has been provided below.
Q:You are given a list dishes, where each element consists of a list of strings beginning with the name of the dish, 
followed by all the ingredients used in preparing it. You want to group the dishes by ingredients, so that for each 
ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list beginning with the ingredient name, followed by the names of all the dishes 
that contain this ingredient. The dishes inside each list should be sorted lexicographically, and the result array should 
be sorted lexicographically by the names of the ingredients.
*/

ArrayList<ArrayList<String>> solution(String[][] dishes) {
    
    HashMap<String,ArrayList<String>> ingr_map = new HashMap<String,ArrayList<String>>();
    
    ArrayList<String> ingr_names = new ArrayList<String>();
    for(String[] ingr_list: dishes){
        for(int i = 1; i < ingr_list.length; i++){
            if(ingr_map.containsKey(ingr_list[i])){
                ArrayList<String> dish_using_ingr = ingr_map.get(ingr_list[i]);
                dish_using_ingr.add(ingr_list[0]);
                //Collections.sort(dish_using_ingr);
                ingr_map.put(ingr_list[i], dish_using_ingr);
            }else{
                ingr_names.add(ingr_list[i]); //add if does not contain the ingredient
                ArrayList<String> dish_using_ingr = new ArrayList<String>();
                dish_using_ingr.add(ingr_list[0]);
                ingr_map.put(ingr_list[i], dish_using_ingr);
            }
        }
    }
    
    //sort the ingredients
    Collections.sort(ingr_names);
    ArrayList<ArrayList<String>> grouped_ingr = new ArrayList<ArrayList<String>>();
    
    for(String s: ingr_names){
        ArrayList<String> sub_list = new ArrayList<String>();
        ArrayList<String> dishes_sub_list = ingr_map.get(s); 
        if(dishes_sub_list.size() > 1){
            sub_list.add(s);
            Collections.sort(dishes_sub_list);
            sub_list.addAll(dishes_sub_list);
            grouped_ingr.add(sub_list);
        }
    }
    
    
    return grouped_ingr;
    
}

/*
Q: Given an array of strings, return another array containing all of its longest strings.
*/

function solution($inputArray) {
    $max_length = 0;
    foreach($inputArray as $item){
        if(strlen($item) > $max_length){
            $max_length = strlen($item);
        }
    }
    
    $sol_array = [];
    foreach($inputArray as $item){
        if(strlen($item) == $max_length){
            $sol_array[] = $item;
        }
    }
    
    return $sol_array;

}

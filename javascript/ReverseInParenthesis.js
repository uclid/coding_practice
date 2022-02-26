/*
Q: Write a function that reverses characters in (possibly nested) parentheses in the input string.
Input strings will always be well-formed with matching ()s.
*/

function solution(inputString) {
    
    var opening_indexes = [];
    for(var i = 0; i < inputString.length; i++){
        
        if(inputString.charAt(i) === '('){
            opening_indexes.push(i);
        }
           
    }
    
    //console.log(opening_indexes);
    
    var string_arr = inputString.split("");
    
    //starting from the last opening parentheis
    for(var j = opening_indexes.length - 1; j >= 0; j--){
        var next = opening_indexes[j] + 1;
        //then reverse until the first closing parenthesis found
        while(string_arr[next] !== ')'){
            //console.log(opening_indexes[j] + "" + next + " " + string_arr[next]);
            next++;
        }

        string_arr[opening_indexes[j]] = '-';
        string_arr[next] = '-';

        //console.log(string_arr);
        
        //reverse part between parenthesis here
        var left = opening_indexes[j] + 1;
        var right = next - 1;
        while(left < right){
            //swap the items
            var temp = string_arr[left];
            //console.length(temp);
            string_arr[left] = string_arr[right];
            //console.length(temp);
            string_arr[right] = temp;
            //console.length(temp);
            
            //change pointers
            left++;
            right--;
            
        }

        //console.log(string_arr);
        
    }
    
    //finally use the array to construct operated string
    var returnString = "";
    for(var k = 0; k < inputString.length; k++){
        if(string_arr[k] !== '-'){
            returnString += string_arr[k];
        }
    }
    
    return returnString;
    
}

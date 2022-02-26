/*
Q: Given a string, find out if its characters can be rearranged to form a palindrome.
*/

bool thresholdCheck(map<char,int> char_map, int threshold){
    int bad_count = 0;
    
    map<char, int>::iterator it = char_map.begin();
    while(it != char_map.end()){
        
        //getting key
        //char character = it->first;
        
        //getting value
        int count = it->second;
        //cout << count << " ";
        if(count % 2 != 0){
            //odd count
            bad_count++;
        }
        
        if(bad_count > threshold)
            return false;
            //return false as soon as threshold exceeds
        
        it++; //move iterator
    }
    
    return true;
}

bool solution(string inputString) {
    
    map<char,int> char_map;
    //build the character map from string
    //based on letter counts
    for(int i = 0; i < inputString.size(); i++){
        char c = inputString.at(i);
        int key_count = char_map.count(c);
        if(key_count){
            int curr_val = char_map.at(c);
            char_map.at(c) = curr_val + 1;
        }else{
            char_map.insert(pair<char, int>(c, key_count + 1));   
        }
    }
    
    if(inputString.size() % 2 == 0){
        //all char counts should be even
        return thresholdCheck(char_map, 0);
    }else{
        //one char i.e. middle one can be odd
        return thresholdCheck(char_map, 1);
    }
    
}

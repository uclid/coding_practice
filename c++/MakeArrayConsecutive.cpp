/*
Q: X got statues of different sizes as a present from Y for his birthday, each statue having 
an non-negative integer size. Since X likes to make things perfect, X wants to arrange them from smallest to 
largest so that each statue will be bigger than the previous one exactly by 1. X may need some additional 
statues to be able to accomplish that. Help X figure out the minimum number of additional statues needed.
*/

int solution(vector<int> statues) {
    
    int min = INT_MAX;
    int max = INT_MIN;
    for (auto i = statues.begin(); i != statues.end(); i++){
        if(*i < min){
            min = *i;
        }
        if(*i > max){
            max = *i;
        }
    }
    
    return max-min-statues.size()+1;
    
}


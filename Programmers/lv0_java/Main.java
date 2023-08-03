class Solution {
    public int combination(int balls , int share){
        if(balls == share || share == 0)
            return 1;
        return combination(balls-1, share) + combination(balls-1, share-1);
    }

    public int solution(int balls, int share) {
        return combination(balls, share);
    }
}
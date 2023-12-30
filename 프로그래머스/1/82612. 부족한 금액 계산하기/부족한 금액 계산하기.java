class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long need_totalMoney = 0;
        int value_price = 0;
        
        for(int i = 1; i <= count; i++){
            value_price = price;
            value_price *= i;
            need_totalMoney += value_price;
        }
        
        if(money < need_totalMoney){
            answer = need_totalMoney - money;
        }
        else{
            answer = 0;
        }

        return answer;
    }
}
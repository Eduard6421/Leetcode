class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 1){
            if(flowerbed[0] == 1){
                if(n > 0){
                    return false;
                }
                else {
                    return true;
                }
            }
            else {
                if(n <= 1){
                    return true;
                }
                else {
                    return false;
                }
            }
        }


        int flowersAdded = 0;
        for(int i = 0 ; i  < flowerbed.length ; ++i){
            if(flowerbed[i] == 0){
                if(i == 0){
                    if(flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        flowersAdded++;
                    }
                } else if (i == flowerbed.length- 1) {
                    if(flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        flowersAdded++;
                    }
                }
                else {
                    if(flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        flowersAdded++;
                    }
                }
            }
        }

        return flowersAdded >= n;
    }
}
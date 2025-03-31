package Leetcode75;

public class _605_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0 & n>0){
                if(i>0 && flowerbed[i-1] == 0 || i==0){
                    if(i<flowerbed.length -1 && flowerbed[i+1] == 0 || i== flowerbed.length-1){
                        n--;
                        i++;
                    }
                }
            }
        }
        return n==0;
    }
}

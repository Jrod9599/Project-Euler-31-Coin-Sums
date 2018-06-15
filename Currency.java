package com.company;

public class Currency {

    int numCombinations = 0;
    int p = 1;
    int p2 = 2;
    int p5 = 5;
    int p10 = 10;
    int p20 = 20;
    int p50 = 50;
    int p100 = 100;
    int p200 = 200;

    public int possibleCombinations(int target){

        for(int a = 0; a <= target; a += p200){
            for(int b = a; b <= target; b+=p100){
                for(int c = b; c<=target; c+= p50){
                    for(int d = c; d <= target; d+=p20){
                        for(int e = d; e <= target; e+=p10){
                            for(int f = e; f <= target; f+=p5){
                                for(int g = f; g <=target; g+= p2){
                                    for(int h = g; h<=target;h+=p){
                                        if(h==target)
                                            numCombinations++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        return numCombinations;
    }



}

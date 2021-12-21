package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int radius;
        int x1;
        int y1;
        int x2;
        int y2;
        int[] answer = new int[queries.length];
        for (int i=0;i< queries.length;i++)
        {
            radius = queries[i][2];
            x1 = queries[i][0];
            y1 = queries[i][1];
            for(int j=0;j< points.length;j++)
            {
                x2=points[j][0];
                y2=points[j][2];
                if(Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)))==radius)
                {
                    answer[i]++;

                }
            }
        }
        return answer;

    }
}

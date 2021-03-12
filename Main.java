package com.anasmannaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int totalCount = 0;

        for (int x = 1; x <= 4; x++)
            for (int y = 1; y <= 4; y++)
                for (int z = 1; z <= 4; z++)
                    if (x != y && y != z && x != z) {
                        totalCount++;
                        System.out.println(x + "" + y + "" + z);
                    }
        System.out.println("Total count of the three-digit-number is: " + totalCount);
    }
}

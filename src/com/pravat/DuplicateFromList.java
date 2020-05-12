package com.pravat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFromList {
  public static void main(String args[]) {

        List<Integer> listOf = new ArrayList<Integer>();
        listOf.add(3);
        listOf.add(1);
        listOf.add(2);
        listOf.add(3);
        listOf.add(3);
        listOf.add(2);
        listOf.add(1);
        listOf.add(5);

        List<Integer> tempList = new ArrayList<Integer>();
        for(Integer obj:listOf){
          if(!tempList.contains(obj)){
            tempList.add(obj);
           // tempList.sort(obj.compareTo('obj'));

          }
        }
        System.out.println(tempList);

      }

    }


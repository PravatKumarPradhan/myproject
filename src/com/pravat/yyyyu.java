/*
package com.pravat;

import java.util.*;

public class Un {
  private static final int EDGE_WEIGHT = 6;
  public static void main(String[] args) {
    Map<Integer, Set<Integer>> setToNode = new HashMap<>();
    Map<Integer, Integer> nodeToSet = new HashMap<>();

    public int makeConnected(int n, int[][] connections) {
      if (connections.size == 0) {
        return 0;
      }
      // If we don't have enough edges in the graph, it cannot be connected.
      if (connections.length < n - 1) {
        return -1;
      }

      //Assign each node to a disjoint set.
      //There will be at max N disjoint sets for N nodes.
      for (int i=0; i<n; i++) {
        HashSet<Integer> singletonSet = new HashSet<>();
        singletonSet.add(i);
        setToNode.put(i, singletonSet);
        nodeToSet.put(i, i);
      }

      for (int i=0; i<connections.length; i++) {
        int lNode = connections[i][0];
        int rNode = connections[i][1];
        union(lNode, rNode);
      }

      return setToNode.keySet().size() - 1;
    }

    //Join the set which contains lNode with the set that contains rNode.
    private void union(int lNode, int rNode) {
      int lSet = nodeToSet.get(lNode);
      int rSet = nodeToSet.get(rNode);
      if (lSet == rSet) {
        return;
      }

      //Make the right nodes become part of the left set.
      Set<Integer> lNodes = setToNode.get(lSet);
      Set<Integer> rNodes = setToNode.get(rSet);
      for (Integer node : rNodes) {
        nodeToSet.put(node, lSet);
        lNodes.add(node);
      }
      setToNode.put(lSet, lNodes);
      setToNode.remove(rSet);
    }
}
*/

package com.pravat;

import java.util.concurrent.Callable;

interface Bird {
  Egg lay();
}

class Chicken {
  public Chicken() {
  }

  public static void main(String[] args) throws Exception {
    Chicken chicken = new Chicken();
    System.out.println(chicken instanceof Bird);
  }
}

class Egg implements Bird {
  public Egg(Callable<Bird> createBird) {
    throw new UnsupportedOperationException("Waiting to be implemented.");
  }

  public Bird hatch() throws Exception {
    throw new UnsupportedOperationException("Waiting to be implemented.");
  }

  @Override
  public Egg lay() {
    return null;
  }
}
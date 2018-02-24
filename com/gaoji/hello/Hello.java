package com.gaoji.hello;

public class Hello {

  public static void main(String[] args) {

    while(true) {
      System.out.println("Hello guys!");
      try {
        Thread.currentThread().sleep(5000);
      } catch(Exception e) {

      }
    }

  }

}

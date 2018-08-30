package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Provides a greeting.
   * @param someone a descriptor to whom you are greeting.
   *
   * @return the greeting
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

package shoppingsite.controller;

public class cart {

  private String name;
  private int num;


  public cart(String name, int num) {

    this.name = name;
    this.num = num;
  }

  public String getName() {
    return name;
  }
  // setter
  public void setName(String name) {
    this.name = name;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
     this.num = num;
  }
}
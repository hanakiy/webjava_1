package shoppingsite.controller;

/*
public class Order {
  @Autowired
  public static void main(String[] args) {

    List<Order> Name = new ArrayList<> ();
    Name.add(new Order("きりんのハンカチ"));
    Name.add(new Order("さるのハンカチ"));
    Name.add(new Order("ぞうのハンカチ"));
  }

  @Autowired
  public static void main1(String[] args) {

    List<Item> Num = new ArrayList<> ();
    Num.add(new Item("10"));
    Num.add(new Item("20"));
    Num.add(new Item("30"));
  }
}*/

public class Order {

  private String name;

  //商品名
  public String getName() {
    return this.name;
  }
  // setter
  public void setName(String name) {
    this.name = name;
  }

  private int num;

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
     this.num = num;
  }
}

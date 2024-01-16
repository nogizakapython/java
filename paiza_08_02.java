public class paiza_08_02 {
  public static void main(String... args) {
      Item sword = new Item();
      sword.setMsg("インスタンスを生成しました");
      System.out.println(sword.getMsg());
  }
}

class Item {
  private String msg1;
  public Item(){

  }
  public void setMsg(String msg){
    this.msg1 = msg;
  }
  public String getMsg(){
    return this.msg1;
  }



}

class paiza_ex08_02 {
  public static void main(String... args) {
      Monster slime = new Monster();
      slime.setId(5);
      System.out.println(slime.getId());
  }
}

class Monster {
  private int id;
  public Monster(){
  }
  public void setId(int i) {
    this.id = i;
  }
  public int getId(){
    return id;
  }
}

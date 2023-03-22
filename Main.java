class Main {
  public static void main(String[] args) {
    String hw = "Hello World!";
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < hw.length(); j++) {
        System.out.println(hw.charAt(j));
      }
      System.out.println(" ");
    }
  }
}
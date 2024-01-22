class binary {
  public static void main(String[] args) {
    binary recursion = new binary();
    var rec = recursion.decimaltobinary(15);
    System.out.println(rec);

  }

  public int decimaltobinary(int n) {
    if (n == 0) {
      return 0;
    }
    int rem = n % 2;
    if (n == 1) {
      return n % 2;
    }
    return 10 * decimaltobinary(n / 2) + rem;
  }
}

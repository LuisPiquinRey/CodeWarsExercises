interface Count {
  static int countCharOccurrences(String s, char c) {
    return(int) s.chars().filter(ch->ch==c).count();
  }
}
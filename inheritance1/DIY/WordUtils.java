public class WordUtils {
   /** Returns the length of the longest word. */
   public static String longest(List61B<String> list) {
      int maxDex = 0;
      for (int i = 0; i < list.size(); i += 1) {
         String longestString = list.get(maxDex);
         String thisString = list.get(i);
         if (thisString.length() > longestString.length()) {
            maxDex = i;
         }

      }
      return list.get(maxDex);
   }


  public static void main(String[] args) {
     List61B<String> someList = new AList<>();
     SLList<String> anotherList = new SLList<>();
     someList.addLast("elk");
     someList.addLast("are");
     someList.addLast("watching");
     String s = someList.get(1);
     s = new AList<String>("ass").BlaBla;
     System.out.println(s);
//     anotherList.addFirst("sdf");
//     anotherList.addLast("pigfff");
//     System.out.println(longest(someList));
//     System.out.println(longest(anotherList));
//     someList.print();
//     anotherList.print();
  }
}
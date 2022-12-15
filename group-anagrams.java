class Solution {
   public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagramsMap = new HashMap<>();

    for (String string : strs) {
      char[] chars = string.toCharArray();
      Arrays.sort(chars);
      String sortedString = new String(chars);
      anagramsMap.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(string);
    }

    return new ArrayList<>(anagramsMap.values());
  }
}

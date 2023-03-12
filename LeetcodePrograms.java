
//383. Ransom Note

public class SumOfLargestElementInArray {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            int currentCount = hashMap.getOrDefault(m, 0);
            hashMap.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currentCount = hashMap.getOrDefault(r, 0);
            if (currentCount == 0) {
                System.out.println("false");
            }
            hashMap.put(r, currentCount - 1);
        }
        System.out.println("true");
    }

}

--------------------------------------
  

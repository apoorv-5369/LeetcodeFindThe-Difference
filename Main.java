class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0; // Initialtizing a character to store the answer.
        HashMap<Character, Integer> hm = new HashMap<>(); // Initializing a HashMap.
        // Iterating through the string s, to put its elements into the HashMap.
        for(char c:s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1); // Put the element as key and the value is the number of times the element is accuring the in the string s.
        }
        // Iterating through the string t, to check if the element is in the HashMap or not.
        // If it is not then return the element, otherwise if the value of the containing element is 0, then also return c.
        // Else decrement the value of that key.
        for(int i=0; i<t.length();i++){
            char c=t.charAt(i);
            if(!hm.containsKey(c)) return c;
            else if(hm.get(c)==0) return c;
            else hm.put(c, hm.get(c)-1);
        }
        return ans; // Finally, return the answer.
    }
}

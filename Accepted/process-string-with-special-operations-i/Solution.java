class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z') sb.append(ch);
            else if(ch == '*' && sb.length() >= 1) sb.delete(sb.length()-1, sb.length());
            else if(ch == '#') sb.append(sb);
            else if(ch == '%') sb.reverse();
        }
        return sb.toString();
    }
}
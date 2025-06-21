class Atoi {
    public int myAtoi(String s) {
        s= s.trim();
        if(s.length()==0)
            return 0;
        return (int)helper(s, 0, 0, s.charAt(0) == '-' ? -1 : 1);
    }
    private static long helper(String str, int index, long result, int sign) {
        if (index == str.length()) return sign * result;
        char c = str.charAt(index);
        if (c == '-' && index == 0) return helper(str, index + 1, result, -1);
        if (c == '+' && index == 0) return helper(str, index + 1, result, 1);
        if (c < '0' || c > '9') return sign * result;
        result = result * 10 + (c - '0');
        if(sign * result>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(sign *result<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        return helper(str, index + 1, result, sign);
    }
}
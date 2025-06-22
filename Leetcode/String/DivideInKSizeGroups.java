import java.util.ArrayList;
class DivideInKSizeGroups {
    public String[] divideString(String s, int k, char fill) {
        int i = 0;
        ArrayList<String> ans = new ArrayList<>();
        
        while (i + k <= s.length()) {
            ans.add(s.substring(i, i + k));
            i += k;
        }

        if (i < s.length()) {
            StringBuilder str = new StringBuilder(s.substring(i));
            int remain = k - str.length();
            for (int j = 0; j < remain; j++) {
                str.append(fill);
            }
            ans.add(str.toString());
        }

        return ans.toArray(new String[0]);
    }
}

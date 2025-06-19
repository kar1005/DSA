import java.util.PriorityQueue;
class CaseSpecificSorting {
    public static String caseSort(String s) {
        PriorityQueue<Character> lower = new PriorityQueue<>();
        PriorityQueue<Character> upper = new PriorityQueue<>();
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z')
                upper.add(c);
            else
                lower.add(c);
        }
        StringBuilder str = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c>='A'&&c<='Z')
                str.append(upper.poll());
            else
                str.append(lower.poll());
        }
        return str.toString();
    }
}
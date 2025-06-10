//String Roation checking using the substring approach

class StringRotation {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        String str = s + s;
        if(str.contains(goal))
            return true;
        else
            return false;
    }
}
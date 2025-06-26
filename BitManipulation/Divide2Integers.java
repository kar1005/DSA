class Divide2Integers {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;

        boolean sign = true;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            sign = false;

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        long ans = 0;

        while(n >= d){
            int count = 0;
            while(n >= (d << (count + 1))){
                count++;
            }
            ans += 1L << count;
            n -= d << count;
        }

        if(ans > Integer.MAX_VALUE)
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        return sign ? (int)ans : (int)(-ans);
    }
}

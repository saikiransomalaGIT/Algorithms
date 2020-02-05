class IsPalindrome {
    public boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x!= 0)) {
            return false;
        }
        
        int invertedNumber = 0;
        
        while (x > invertedNumber) {
            invertedNumber = invertedNumber * 10 + x % 10;
            x = x / 10;
        }
        return x == invertedNumber || x == invertedNumber/10;
}
}
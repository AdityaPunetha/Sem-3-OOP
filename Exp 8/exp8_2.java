class exp8_2 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("aditya");
        System.out.println("Original string: " + s);
        for (int i = 0; i < s.length(); i++)
            s.setCharAt(i, (char) (s.charAt(i) - 32));
        System.out.println("Modified String: " + s);

    }
}

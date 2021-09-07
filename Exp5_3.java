interface xyz {
    int a = 10;
}

class abc implements xyz {
    public static void main(String args[]) {
        abc obj = new abc();
        System.out.println(obj.a);
    }
}
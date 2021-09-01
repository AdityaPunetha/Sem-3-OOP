class Player {
    String name;
    int age;

    Player(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Player name: " + name);
        System.out.println("Age: " + age);
    }
}

class cricket_player extends Player {
    String type;

    cricket_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("Player type : " + type);
    }
}

class football_player extends Player {
    String type;

    football_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("Player type : " + type);
    }
}

class hockey_player extends Player {
    String type;

    hockey_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("Player type : " + type);
    }
}

class exp4_2 {
    public static void main(String[] args) {
        hockey_player h = new hockey_player("Aditya Punetha", "Hockey", 19);
        cricket_player c = new cricket_player("Dhanraj Chauhan", "Football", 19);
        football_player f = new football_player("Rohan Chauhan", "Cricket", 19);
        h.show();
        c.show();
        f.show();
    }
}

class mamtha {
    int a = 100;

    void show() {
        System.out.println("parent class");
    }
}

class kanishka extends mamtha {

    void display() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        kanishka obj = new kanishka();
        obj.show();
        obj.display();
        System.out.println(obj.a);
    }
}

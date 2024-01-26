class super{
    int a = 10;
}

class sub extends super{
    int a = 20;
}

public static void main(String[] args) {
    sub s = new sub();
    System.out.println(s.a);
}
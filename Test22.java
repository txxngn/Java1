package Week12;

class Test22 {
    public static void main(String[] args) {
        A a = new A("asa");
        A b = new A();                     //nothing is passed here(no parameter value)
        //khúc này tạo mới constructor, mà contructor này có print ở trong nên nó print trước
        //còn cái constructor ở trên được called auto nhưng k có yêu cầu print, nó print ra vì có cái method "public void print" print nó ra
        a.print();
    }
}

class A {
    String s;
    A(){
        System.out.println("called"); //khúc này dùng print
    }
    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}


class A {
    public void Show(){
        System.out.println("In A");
    }
}



class anoinn {
    public static void main(String[] args) {
        System.out.println("In Anonymous Class");
        A obj = new A(){
                 public void Show(){
                 System.out.println("In Show");
                }

     };
     obj.Show();

    }
}
 class one{
    public void woe(){
        System.out.println("Hello world");
    }
}

 class two extends one{
    public void woe(){
        System.out.println("Hello wordl and fkkk you");
    }
}

public class inher_simp {
    public static void main(String[]args){
        one t=new two();
        t.woe();
    }
}
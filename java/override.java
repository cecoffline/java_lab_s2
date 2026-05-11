class dog {

public void sound(){
    System.out.println("Bow Bow");
}

}

class cat extends dog{
    public void sound(){
        System.out.println("Meow meow");
    }
}

public class override{
    public static void main(String []args){
        dog so=new cat();
        so.sound();
    }
}
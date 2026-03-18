class exception {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        }
        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught.");
        }

        System.out.println("Program continues normally...");
    }
}

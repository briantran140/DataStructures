public class Main {

    public static void main(String[] args) {
	// write your code here

//        int[] array = new int[5];
//        int a = 1;
//        System.out.println("a: " + a);
//        array[++a] = 3;
//        System.out.println("a: " + a);
//        for(int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);

//        ArrayStack1 stack = new ArrayStack1(10);

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack1 stack = new LinkedStack1();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);


        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped: " + stack.pop());
//        stack.printStack();
        System.out.println(stack.peek());

        System.out.println("Print stack");
        stack.printStack();
//        char[] in = {'a','b','c'};
//        String string = new String(in);
//
//        String str = "hello";
//        System.out.println(reverse(str));
//        System.out.println(reverse("abcdef"));
    }

    public static String reverse(String string) {
        char[] in = string.toCharArray();
        int begin = 0;
        int end = string.length() - 1;
        char temp;
        for(int i = 0; i < in.length; i++) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            begin++;
            end--;
        }

        return new String(in);
    }





















//    public static String reverse(String input){
//        char[] in = input.toCharArray();
//        int begin=0;
//        int end=in.length-1;
//        char temp;
//        while(end>begin){
//            temp = in[begin];
//            in[begin]=in[end];
//            in[end] = temp;
//            end--;
//            begin++;
//        }
//        return new String(in);
//    }
}

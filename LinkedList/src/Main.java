public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

//        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

//        System.out.println("After adding 4 people front:");
//        System.out.println(list.getSize());
//        list.printList();
//
//        System.out.println("After adding 1 person end:");
//        Employee billEnd = new Employee("Bill", "End", 78);
////        list.addToEnd(billEnd);
//
//        System.out.println("Add Brian before bill:");
//        Employee brianTran = new Employee("Brian", "Tran", 02);
////        list.addBefore(brianTran, billEnd);
//
////        System.out.println(list.getSize());
//
//        list.printList();
//        list.removeFromFront();
////        System.out.println(list.getSize());
//
//        list.printList();
//
////        list.removeFromEnd();
////        System.out.println(list.getSize());
//        list.printList();

        Employee mikeWilsonCopy = mikeWilson;
        System.out.println(mikeWilsonCopy);
        System.out.println(mikeWilson);

//        mikeWilsonCopy.setFirstName("Michael");
        mikeWilson.setFirstName("Michael");
//        mikeWilson = new Employee("Mikey", "Wilson", 46);
        System.out.println("------------");
        System.out.println(mikeWilsonCopy);
        System.out.println(mikeWilson);
    }
}

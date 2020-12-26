public class DialPhone {
    public static void main(String[] args){
        phoneList();
    }
    private static void phoneList(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петрович","541791");
        phoneBook.add("Иванов","546776");
        phoneBook.add("Романов","543992");
        phoneBook.add("Петрович","540000");

        System.out.println("Петрович " + phoneBook.get("Петрович"));
        System.out.println("Иванов" + phoneBook.get("Иванов"));
        System.out.println("Романов " + phoneBook.get("Романов"));


    }
}

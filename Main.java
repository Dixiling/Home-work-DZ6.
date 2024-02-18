public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContacts("Сергей", "123456789");
        phoneBook.addContacts("Сергей", "987654321");
        phoneBook.addContacts("Сергей", "987321654");
        phoneBook.addContacts("Елизавета", "456789123");
        phoneBook.addContacts("Александр", "654231897");
        phoneBook.addContacts("Елизавета", "789123456");
    
        phoneBook.showContacts();
    }
}
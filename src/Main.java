public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Комарова Мирослава", 123132);
        Contact contact2 = new Contact("Хохлов Илья", 453453);
        Contact contact3 = new Contact("Носкова Алина", 456862);
        Contact contact4 = new Contact("Орлова Анна", 125632);
        Contact contact5 = new Contact("Ильин Егор", 125655);
        Contact contact6 = new Contact("Борисова Полина", 121224);
        Contact contact7 = new Contact("Лавров Глеб", 789635);
        Contact contact8 = new Contact("Лазарев Богдан", 325687);
        Contact contact9 = new Contact("Пастухов Егор", 455445);
        Contact contact10 = new Contact("Гаврилов Александр", 145645);
        Contact contact11 = new Contact("Акимов Руслан", 645645);
        Contact contact12 = new Contact("Мухина Ксения", 535353);
        Contact contact13 = new Contact("Малышев Андрей", 145482);
        Contact contact14 = new Contact("Иванов Денис", 997878);
        Contact contact15 = new Contact("Леонова Софья", 887878);
        Contact contact16 = new Contact("Беляев Тимофей", 564564);
        Contact contact17 = new Contact("Гришин Мирослав", 254568);
        Contact contact18 = new Contact("Новиков Андрей", 452345);
        Contact contact19 = new Contact("Фадеева Полина", 532387);
        Contact contact20 = new Contact("Зайцев Руслан", 453484);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addNumber(contact1);
        telephoneDirectory.addNumber(contact2);
        telephoneDirectory.addNumber(contact3);
        telephoneDirectory.addNumber(contact4);
        telephoneDirectory.addNumber(contact5);
        telephoneDirectory.addNumber(contact6);
        telephoneDirectory.addNumber(contact7);
        telephoneDirectory.addNumber(contact8);
        telephoneDirectory.addNumber(contact9);
        telephoneDirectory.addNumber(contact10);
        telephoneDirectory.addNumber(contact11);
        telephoneDirectory.addNumber(contact12);
        telephoneDirectory.addNumber(contact13);
        telephoneDirectory.addNumber(contact14);
        telephoneDirectory.addNumber(contact15);
        telephoneDirectory.addNumber(contact16);
        telephoneDirectory.addNumber(contact17);
        telephoneDirectory.addNumber(contact18);
        telephoneDirectory.addNumber(contact19);
        telephoneDirectory.addNumber(contact20);
        System.out.println(telephoneDirectory);


    }
}
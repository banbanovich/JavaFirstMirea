package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a=new Author("Methodiy", "mirea@edu.mirea.ru",'x');
        System.out.println("Author "+a);
        System.out.println("getName "+a.getName());
        System.out.println("getEmail "+a.getEmail());
        System.out.println("getGender "+a.getGender());
        a.setEmail("mmmirea@edu.mirea.ru");
        System.out.println("setEmail "+a.getEmail());

    }
}

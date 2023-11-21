package entities;

import java.util.Scanner;

public class Rent {
    private String name;
    private String email;

    public Rent() {
    }

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Novo método para permitir a alteração do nome e do e-mail
    public void updateNameAndEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name: ");
        this.name = sc.nextLine();
        System.out.println("Enter new email: ");
        this.email = sc.next();
    }

    public String getNameAndEmail() {
        return "Name: " + name + ", Email: " + email;
    }

    public void setNameAndEmail(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Rent: " + name + '\'' + email + '\'';
    }
}

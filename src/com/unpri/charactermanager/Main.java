package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CHARACTER MANAGER ===");

        // Membuat tiga karakter
        Character c1 = new Character(
            "Arthas",
            CharacterType.WARRIOR
        );

        Character c2 = new Character(
            "Merlin",
            CharacterType.MAGE,
            3
        );

        Character c3 = new Character(
            "Robin",
            CharacterType.ARCHER
        );

        // Menampilkan karakter sebelum level up
        System.out.println("\n--- Data Karakter ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Demo level up
        System.out.println("\n--- Demo Level Up ---");

        System.out.println("Sebelum level up:");
        System.out.println(c1);

        c1.setLevel(c1.getLevel() + 1);

        System.out.println("Sesudah level up:");
        System.out.println(c1);

        // Mini-Challenge: karakter baru dengan mana
        System.out.println("\n--- Mini-Challenge ---");

        Character c4 = new Character(
            "Luna",
            CharacterType.MAGE
        );

        c4.setMana(75);

        System.out.println("Karakter baru:");
        System.out.println(c4);

        System.out.println(
            "Mana Luna: " + c4.getMana()
        );

        System.out.println(
            "Apakah Luna masih hidup? " + c4.isAlive()
        );

        // Demo isAlive untuk karakter dengan HP nol
        c4.setHitPoints(0);

        System.out.println(
            "Setelah HP menjadi 0, apakah Luna masih hidup? "
            + c4.isAlive()
        );
    }
}
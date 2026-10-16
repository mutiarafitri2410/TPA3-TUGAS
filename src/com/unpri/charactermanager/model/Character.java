package com.unpri.charactermanager.model;

public class Character {

    // Atribut private (encapsulation)
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana;

    // Constructor 1: menggunakan nilai awal level 1
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hitPoints = 100;
        this.attack = 10;
        this.mana = 0;
    }

    // Constructor 2: nilai level ditentukan saat objek dibuat
    public Character(String name, CharacterType type, int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level harus minimal 1."
            );
        }

        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = 100 + ((level - 1) * 20);
        this.attack = 10 + ((level - 1) * 5);
        this.mana = 0;
    }

    // Getter dan setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan setter type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter dan setter level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level harus minimal 1."
            );
        }

        this.level = level;

        // HP dan attack dihitung ulang di dalam class
        this.hitPoints = 100 + ((level - 1) * 20);
        this.attack = 10 + ((level - 1) * 5);
    }

    // Getter dan setter hitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                "Hit points tidak boleh negatif."
            );
        }

        this.hitPoints = hitPoints;
    }

    // Getter dan setter attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            throw new IllegalArgumentException(
                "Attack tidak boleh negatif."
            );
        }

        this.attack = attack;
    }

    // Mini-Challenge: getter dan setter mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif."
            );
        }

        this.mana = mana;
    }

    // Mini-Challenge: mengecek apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", mana=" + mana +
                ", isAlive=" + isAlive() +
                '}';
    }
}
// Создаем интерфейс HavingSuperAbility
interface HavingSuperAbility {
    void applySuperAbility();
}

// Создаем абстрактный класс Hero, реализующий интерфейс
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
}

// Создаем классы героев и реализуем метод applySuperAbility()
class Magic extends Hero {
    public Magic() {
        super(100, 30, "MAGIC SPELL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}

class Medic extends Hero {
    private int healPoints;

    public Medic() {
        super(80, 20, "HEALING");
        healPoints = 50;
    }

    // Метод для увеличения опыта лечения
    public void increaseExperience() {
        healPoints += healPoints * 0.10;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType);
        increaseExperience();
    }
}

class Warrior extends Hero {
    public Warrior() {
        super(150, 40, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}


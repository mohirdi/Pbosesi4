package Overriding;
public class Hero {
    public void Atribut() {
        System.out.println("Skill hero:  ");
    }
}

class Bristleback extends Hero {
    @Override
    public void Atribut() {
        System.out.println("Mengeluarkan duri ketika diserang \n");
        System.out.println("Pengurangan damage \n");
    }
}

class Axe extends Hero {
    @Override
    public void Atribut() {
        System.out.println("Memutar kapak ketika diserang \n");
        System.out.println("Mengeliminasi lawan seketika \n");
    }
}
package ITMO.lab3;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        tree.AgeAndNameSetter(350,"Дубина");
        tree1.AllArcsSetter(300,"Волына", true);
        tree2.Nothing();
        System.out.println(tree);
        System.out.println(tree1);
        System.out.println(tree2);
    }
    int ageOfTree;
    boolean itsAlive;
    String nameOfTree;

    public void AgeAndNameSetter(int ageOfTree, String nameOfTree){
        this.nameOfTree = nameOfTree;
        this.ageOfTree = ageOfTree;
    }

    public void AllArcsSetter(int ageOfTree, String nameOfTree, boolean itsAlive) {
        this.itsAlive = itsAlive;
        this.nameOfTree = nameOfTree;
        this.ageOfTree = ageOfTree;
    }
    void Nothing(){
        System.out.println("Пустой конструктор сработал");
    }

    @Override
    public String toString() {
        return "Дерево" +
                ", его возраст " + ageOfTree +
                ", оно живое? " + itsAlive +
                ", как его называют '" + nameOfTree + '\'' +
                '}';
    }
}

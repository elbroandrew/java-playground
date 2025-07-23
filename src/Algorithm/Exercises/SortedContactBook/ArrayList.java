package Algorithm.Exercises.SortedContactBook;

public class ArrayList {
    String[] names;
    int capacity = 3;
    int size = 0;
    public ArrayList(){
        names = new String[capacity]; // default size
    }

    public void addLast(String name){
        if (names.length <= size) {
            String[] newNames = new String[capacity *= 2];
            for (int i = 0; i < names.length; i++) {
                newNames[i] = names[i];
            }
            names = newNames;
        }
        names[size] = name;
        size++;
    }

    public void insert(String name, int pos) throws IllegalArgumentException{
        if(pos > names.length){
            addLast(name);
            throw new IllegalArgumentException("pos is greater than array size");
        }
        names[pos] = name;
        size++;
    }

    public String get(int index){
        return names[index];
    }

    public int len(){
        return size;
    }
}

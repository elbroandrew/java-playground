package Algorithm.Exercises.SortedContactBook;

public class SortedContactBook {

    ArrayList names;

    public SortedContactBook(){
        names = new ArrayList();
    }

    private int insertPosition(String name){
        //(Binary Search for position is better here than Insertion sort)
        int left = 0;
        int right = names.len() - 1;
        while (left <= right){
            int q = (left + right)/2;
            int res = Comparator.Do(names.get(q), name);
            if(res < 0){
                left = q + 1;
            } else if (res > 0) {
                right = q - 1;
            }else {
                return q;
            }
        }

        return left;
    }

    public void addContact(String name){
        int pos = insertPosition(name);
        System.out.println(pos);
        names.insert(name, pos);
    }

    public int getContact(String name) {
        // binary search
        int left = 0;
//        System.out.println(names.len());
        int right = names.len() - 1;
        while (left <= right){
            int q = (left + right)/2;
            int res = Comparator.Do(names.get(q), name);
            if(res == 0){
                return q;
            } else if (res < 0) {
                left = q + 1;
            }else {
                right = q - 1;
            }
        }
        return -1; // not found index
    }

    public String[] getAll(){
        String[] arr = new String[names.size];
        for(int n = 0; n < names.size; n++){
            arr[n] = names.get(n);
        }

        return arr;
    }

}




package smartarray;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] date;
    private int size;
    int capacity;

    public SmartArray() {
        this.date = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        size = 0;
    }

    private void shrink() {
        if (this.capacity / size == 4) {
            this.capacity /= 2;
        }
    }

    public boolean contains(int number) {
        for (int i = 0; i < size; i++) {
            if (date[i] == number) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        CheckIndex(index);

        ShiftLeft(index);
        size--;
        shrink();
    }

    public int size() {
        return this.size;
    }

    private void ShiftLeft(int index) {
        for (int i = index; i < size; i++) {
            this.date[i] = this.date[i + 1];
        }
        this.date[size - 1] = 0;
    }

    public StringBuilder joinBy(String connection) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            str.append(this.date[i]);
            if (i != this.size - 1) {
                str.append(connection);
            }
        }
        return str;
    }

    public void printAll() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.date[i]);
        }
    }

    public void replace(int index1, int index2) {
        CheckIndex(index1);
        CheckIndex(index2);
        int temp = this.date[index1];
        this.date[index1] = this.date[index2];
        this.date[index2] = temp;
    }

    public void add(int number) {
        if (this.size == this.capacity) {
            resize();
        }
        date[size] = number;
        this.size++;
    }

    public int get(int index) {
        this.CheckIndex(index);
        return date[index];
    }

    private void resize() {
        this.capacity = capacity * 2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.capacity / 2; i++) {
            temp[i] = this.date[i];
        }
        this.date = new int[this.capacity];
        this.date = temp;

    }

    private boolean CheckIndex(int index) {
        if (index >= 0 && index < this.size) {
            return true;
        }
        throw new IndexOutOfBoundsException("Error index");
    }
}

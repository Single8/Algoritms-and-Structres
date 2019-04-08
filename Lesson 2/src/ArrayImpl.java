public class ArrayImpl<E extends Object & Comparable> implements Array<E> {

    protected E[] array;
    protected int size = 0;

    public ArrayImpl(int size) {
        //this.size = size;
        this.array = (E[]) new Object[size];
    }

    public ArrayImpl(int size, Class<E> type) {
        //this.size = size;
        this.array = (E[]) java.lang.reflect.Array.newInstance(type, size);
    }

    @Override
    public E get( int index) {
        return array[index];
    }

    @Override
    public void insert(E value)
    //throws IndexOutOfBoundsException
    {
     array[size++] = value;
    }

    @Override
    public void display() {
        for (int i = 0; i<size; i++){
            System.out.println(array[i]);
        }
    }

        @Override
        public boolean contains(E value) {
            return indexOf(value) != -1;
        }
    @Override
        public int indexOf (E value){
        for (int i = 0; i<size; i++){
            if(array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean isFull(){

        return size >= array.length;
    }

    @Override
    public void sortBubble() {
        for (int i=0; i < size -1; i++) {
            for (int j = 0; j < size -1 - i; j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    exchange(j, j+1);
                }
            }
            
        }
    }

    private void exchange(int index1, int index2) {
        E temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    @Override
    public void sortSelect() {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
               if (array[j].compareTo(array[min]) <0 ){
                   min = j;
               }
            }
            exchange(i, min);
            
        }
    }

    @Override
    public void sortInsert() {
        for (int currentIndex = 1; currentIndex < size; currentIndex++) {
            int in = currentIndex;
            E value = array[currentIndex];
            while (in > 0 && array[in - 1].compareTo(value) >= 0) {
                array[in] = array[in - 1];
                in--;
        }
        array[in] = value;
    }
    }


    @Override
    public boolean delete(E value){
       int index =  indexOf(value);
       if (index < 0){
           return false;
       }
        for (int i = index; i<(size-1); i++){
           array[i] = array[i+1];
        }
        clearElement(size-1);
        size--;
        return true;
            }
            private void clearElement (int index) {
                array[index] = null;
            }

            }



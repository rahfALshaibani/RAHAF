public class ArrayStack <E> implements Stack<E>{

        private E data[];
        private int t=-1;
        public ArrayStack(int cap){
            data= (E[]) new Object[cap];
        }


        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public void push(E element) {
            if (size()==data.length)throw new IllegalStateException("Stack Is full");

            data[++t]=element;


        }

        @Override
        public E pop() {

            if (isEmpty())return null;
            E deleted=data[t];
            data [t]=null;
            return deleted;
        }

        @Override
        public E top() {
            if (isEmpty())return null;
            return data[t];
        }

    }



import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedPositionalList <E> implements PositionalList<E>{
    private static class Node<E> implements Position<E>{
        E element;
        Node<E>prev;
        Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        @Override
        public E getElement() {
            return element;
        }
    }
    private Node<E>header;
    private Node<E>trailer;
    private int size;
    public LinkedPositionalList() {
        header= new Node<>(null,null,null);
        trailer= new Node<>(null,header,trailer);
        header.setNext(trailer);
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    private Node<E>validate(Position<E>p){
        if (!(p instanceof Node))
            throw new IllegalArgumentException("invalide position");
        Node<E>n= (Node<E>) p;
        if (n.getNext()==null)
            throw new IllegalArgumentException("p is no longer in the list");
        return n;

}
    private Position<E> position(Node<E>n) {
    if (n==header||n==trailer)return null;
    return n;
}
    @Override
    public Position<E> first() {
        return position(header.getNext());
    }
    @Override
    public Position<E> last() {
        return position(trailer.getPrev());
    }
    @Override
    public Position<E> after(Position<E>p) {
       Node<E>n= validate(p);
        return position(n.getNext());
    }
    @Override
    public Position<E> before(Position<E>p) {
        Node<E>n= validate(p);
        return position(n.getPrev());    }
    private Node<E>addBetween(E e,Node<E>pre,Node<E>nx) {
    Node<E>n= new Node<>(e,pre,nx);
    pre.setNext(n);
    nx.setPrev(n);
    size++;
    return n;
}
    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e,header,header.next);
    }
    @Override
    public Position<E> addLast(E e) {
        return addBetween(e,trailer.prev,trailer);
    }
    @Override
    public Position<E> addAfter(Position<E> p, E e) {
       Node<E>n= validate(p);
        return addBetween(e,n,n.next);
    }
    @Override
    public Position<E> addBefore(Position<E> p, E e) {
        Node<E>n= validate(p);
        return addBetween(e,n.prev,n);
    }
    @Override
    public E set(Position<E> p, E e) {
        Node<E>n=validate(p);
        E old=n.getElement();
        n.setElement(e);
        return old;
    }
    @Override
    public E remove(Position<E> p) {
        Node<E>n=validate(p);
        Node<E>pre=n.getPrev();
        Node<E>nx=n.getNext();
        pre.setNext(nx);
        nx.setPrev(pre);
        size--;
        E del=n.getElement();
        n.setElement(null);
        n.setPrev(null);
        n.setNext(null);
        return del;
    }
private class PositionIterator implements Iterator<Position<E>>
{
Position<E>cursor=first();
Position<E>recent=null;
    @Override
    public boolean hasNext() {
        return cursor!=null;
    }

    @Override
    public Position<E> next() {
        if (cursor==null)throw new NoSuchElementException("no thing left");
        recent=cursor;
        cursor=after(cursor);
        return recent;
    }
}
  public class PositionIterable implements Iterable<Position<E>>
  {

      @Override
      public Iterator<Position<E>> iterator() {
          return new PositionIterator();
      }
  }

  private class ElementIterator implements Iterator<E>
  {Iterator<Position<E>>posIterator=new PositionIterator();
      @Override
      public boolean hasNext() {
          return posIterator.hasNext();
      }

      @Override
      public E next() {
          return posIterator.next().getElement();
      }
  }
  public Iterable< Position<E>>positions()
    {
        return new PositionIterable();
    }
  public Iterator<E>iterator()
  {
      return new ElementIterator();
  }
}

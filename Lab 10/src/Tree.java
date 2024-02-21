public interface Tree <E>{
    Position<E>root();
    Position<E>parent(Position<E>p);
    Iterable<Position<E>>childern(Position<E>p);
    int numChildern


}

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {

    /**
     * Returns the position of the root of the tree (or null if empty).
     * @return
     */
    AbstractTree.Position<E> root();

    /**
     * Returns the position of the parent of position p (or null if p is the root).
     * @param position
     * @return
     */
    AbstractTree.Position<E> parent(AbstractTree.Position<E> position) throws IllegalStateException;

    /**
     * Returns an iterable collection containing the children of position p (if any).
     * @param position
     * @return
     */
    Iterable<AbstractTree.Position<E>> children(AbstractTree.Position<E> position) throws IllegalStateException;

    /**
     * Returns the number of children of position p.
     * @param position
     * @return
     */
    int numChildren(AbstractTree.Position<E> position) throws IllegalStateException;

    /**
     * Returns true if position p has at least one child.
     * @param position
     * @return
     */
    boolean isInternal(AbstractTree.Position<E> position) throws IllegalStateException;

    /**
     * Returns true if position p does not have any children.
     * @param position
     * @return
     */
    boolean isExternal(AbstractTree.Position<E> position) throws IllegalStateException;

    /**
     * Returns true if position p is the root of the tree.
     * @param position
     * @return
     */
    boolean isRoot(AbstractTree.Position<E> position) throws IllegalStateException;

    int size();

    boolean isEmpty();

    /**
     * Returns an iterator for all elements in the tree (so that the tree itself is Iterable).
     * @return
     */
    @Override
    Iterator<E> iterator();

    /**
     * Returns an iterable collection of all positions of the tree.
     * @return
     */
    Iterable<AbstractTree.Position<E>> positions();

}
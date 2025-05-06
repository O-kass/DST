import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractTree<E> implements Tree<E> {


    public interface Position<E> {

        /**
         * Returns the element stored at this position.
         *
         * @return An element
         * @throws IllegalStateException if position no longer valid
         */
        E getElement() throws IllegalStateException;
    }

    @Override
    public boolean isInternal(Position<E> position) throws IllegalStateException {
        return (numChildren(position) > 0);
    }


    @Override
    public boolean isExternal(Position<E> position) throws IllegalStateException {
        return (numChildren(position) == 0);
    }

    @Override
    public boolean isRoot(Position<E> position) throws IllegalStateException {
        return (parent(position) == null);
    }

    @Override
    public boolean isEmpty() {
        return (root() == null);
    }

    public int depth(Position<E> position) {
        if (size() == 0 || position == root()) {
            return 0;
        } else {
            int i = 0;
            while (position != root()) {
                position = parent(position);
                i++;
            }
            return i;
        }
        //Better to do return 1 + depth(parent(position));
    }


    /**
     * Returns the height of the subtree rooted at Position p.
     *
     * @param position
     * @return
     */
    public int height(Position<E> position) {
        if (size() == 0 || isExternal(position)) {
            return 0;
        } else {
            int height = 0;
            for (Position<E> child : children(position)) {
                int childHeight = 1 + height(child);
                if (childHeight > height) {
                    height = childHeight;
                }
            }
            return height;
        }


    }

    /**
     * Returns the height of the tree.
     *
     * @return
     */
    private int heightBad() {
        int height = 0;
        for (Position<E> position : positions()) {
            if (isExternal(position)) {
                int newHeight = depth(position);
                if (newHeight > height) {
                    height = newHeight;
                }
            }
        }

        return height;
    }

    /**
     * Adds positions of the subtree rooted at position to the given snapshot.
     *
     * @param position
     * @param snapshot
     */
    private void preOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        snapshot.add(position);         // for preorder, we add position before exploring subtrees

        for (Position<E> child : children(position)) {
            preOrderSubtree(child, snapshot);
        }
    }

    /**
     * Returns an iterable collection of positions of the tree, reported in preorder.
     *
     * @return
     */
    public Iterable<Position<E>> preOrder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            preOrderSubtree(root(), snapshot);
        }

        return snapshot;
    }

    /**
     * Adds positions of the subtree rooted at Position p to the given snapshot.
     *
     * @param position
     * @param snapshot
     */
    private void postOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        for (Position<E> child : children(position)) {
            postOrderSubtree(child, snapshot);
        }

        snapshot.add(position);         // for preorder, we add position before exploring subtrees
    }

    public Iterable<Position<E>> postOrder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            postOrderSubtree(root(), snapshot);
        }

        return snapshot;
    }

    /**
     * Returns an iterable collection of positions of the tree in breadth-first order.
     *
     * @return
     */
    public Iterable<Position<E>> breathFirst() {
        List<Position<E>> snapshot = new ArrayList<>();

        if (!isEmpty()) {
            Queue<Position<E>> fringe = new LinkedQueue<>();
            fringe.enqueue(root());

            while (!fringe.isEmpty()) {
                Position<E> position = fringe.dequeue();
                snapshot.add(position);

                for (Position<E> child : children(position)) {
                    fringe.enqueue(child);
                }
            }
        }

        return snapshot;
    }
}


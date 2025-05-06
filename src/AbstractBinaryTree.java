
    private void inOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        if(left(position) != null){
            inOrderSubtree(left(position), snapshot);
        }
        snapshot.add(position);
        if(right(position) != null){
            inOrderSubtree(right(position), snapshot);
        }
    }

    private void preOrderSubtree(Position<E> position, List<Position<E>> snapshot) {

        snapshot.add(position);

        if(left(position) != null){
            preOrderSubtree(left(position), snapshot);
        }

        if(right(position) != null){
            preOrderSubtree(right(position), snapshot);
        }
    }

    private void postOrderSubtree(Position<E> position, List<Position<E>> snapshot) {


        if(left(position) != null){
            postOrderSubtree(left(position), snapshot);
        }

        if(right(position) != null){
            postOrderSubtree(right(position), snapshot);
        }

        snapshot.add(position);
    }


}

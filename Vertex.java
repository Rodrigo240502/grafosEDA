public class Vertex<E> {
    protected E data;
    protected LinkedList<Edge<E>> listAdj;

    public Vertex(E data){
        this.data = data;
        listAdj = new LinkedList<Edge<E>>();
    }
    public E getData(){
        return this.data;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vertex<?>){
            Vertex<E> v = (Vertex<E>) obj;
            return this.data.equals(v.data);
        }
        return false;
    }
    public String toString(){
        return this.data + "-->" + this.listAdj.toString()+"\n";
    }
}

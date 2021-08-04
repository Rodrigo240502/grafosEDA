public class Edge<E> {
    protected Vertex<E> refDest;
    public int weight;

    public Edge(Vertex<E> refDest){
        this(refDest, -1);
    }
    public Edge(Vertex<E> refDest, int weight){
        this.refDest = refDest;
        this.weight = weight;
    }
    public boolean equals(Object obj){
        if(obj instanceof Edge<?>){
            Edge<E> e = (Edge<E>) obj;
            return this.refDest.equals(e.refDest);
        }
        return false;
    }
    public String toString(){
       if(this.weight > -1){
           return refDest.data+" ["+this.weight+"], ";
       }
       else{
           return refDest.data+", ";
       }
    }
}

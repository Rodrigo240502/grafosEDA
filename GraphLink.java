public class GraphLink<E> {
    protected LinkedList<Vertex<E>> vertexList;

    public GraphLink(){
        vertexList = new LinkedList<Vertex<E>>();
    }
    public void insertVertex(E data){
        Vertex<E> newVertex = new Vertex<E>(data);
        if(this.vertexList.search(newVertex) != null){
            System.out.println("Vertice ya ingresado");
            return;
        }
        this.vertexList.insertFirst(newVertex);
    }
    public void insertEdge(E verOrigin, E verDest){
        insertEdge(verOrigin, verDest, -1);
    }
    public void insertEdge(E verOrigin, E verDest, int weight){
        Vertex<E> refOrigin = this.vertexList.search(new Vertex<E>(verOrigin));
        Vertex<E> refDest = this.vertexList.search(new Vertex<E>(verDest));
        if(refOrigin == null || refDest == null){
            System.out.println("Vertice origen y/o destino no existen");
            return;
        }
        if(refOrigin.listAdj.search(new Edge<>(refDest)) != null){
            System.out.println("Arista insertada anteriormente");
            return;
        }
        refOrigin.listAdj.insertFirst(new Edge<E>(refDest,weight));
        refDest.listAdj.insertFirst(new Edge<E>(refOrigin,weight));
    }
    public String toString(){
        return this.vertexList.toString();
    }
}

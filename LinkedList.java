
public class LinkedList<T> {
    protected Node<T> first;

    public LinkedList(){
        this.first = null;
    }
    public boolean isEmpty(){
        return this.first == null;
    }
    public T search(T data){
        Node<T> aux = this.first;
        while(aux != null && !aux.data.equals(data)){
            aux = aux.getNext();
        }
        if(aux != null){
            return aux.getData();
        }
        return null;
    }
    public void insertFirst(T data){
        this.first = new Node<T>(data, this.first);
    }
    public String toString(){
        String str = "";
        Node<T> aux = this.first;
        while(aux != null){
            str += aux.getData();
            aux = aux.getNext();
        }
        return str;
    }
    
}

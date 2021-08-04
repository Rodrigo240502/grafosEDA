public class TestGraphLink {
    public static void main(String[] args) {
        GraphLink<String> g = new GraphLink<String>();
        g.insertVertex("Lima");
        g.insertVertex("Arequipa");
        g.insertVertex("Cusco");
        g.insertVertex("Tacna");
        g.insertVertex("Puno");
        g.insertVertex("Piura");

        g.insertEdge("Lima", "Arequipa");
        g.insertEdge("Cusco", "Arequipa");
        g.insertEdge("Lima", "Piura");
        g.insertEdge("Lima", "Cusco");

        System.out.println(g);
        
    }
}

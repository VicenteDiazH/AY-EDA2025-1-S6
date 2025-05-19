import java.util.Arrays;

class Point {

    int x;
    int y;

    // Constructor que genera puntos aleatorios con coordenadas entre 0 y 9
    Point() {
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

    // Método para imprimir un arreglo de puntos
    static void printPoints(Point[] points) {
        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
        System.out.println();
    }

    // Función para calcular la distancia desde el origen
    static double distance(Point p) {
        return Math.sqrt(p.x * p.x + p.y * p.y);
    }

    public static void main(String[] args) {
        Point[] points = new Point[6];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }

        System.out.println("Puntos generados aleatoriamente:");
        printPoints(points);

        // a) Ordenar por coordenada X
        Arrays.sort(points, (a, b) -> Integer.compare(a.x, b.x));
        System.out.println("Puntos ordenados por coordenada X:");
        printPoints(points);

        // b) Ordenar por coordenada Y
        Arrays.sort(points, (a, b) -> Integer.compare(a.y, b.y));
        System.out.println("Puntos ordenados por coordenada Y:");
        printPoints(points);

        // c) Ordenar por distancia desde el origen
        Arrays.sort(points, (a, b) -> Double.compare(distance(a), distance(b)));
        System.out.println("Puntos ordenados por distancia desde el origen:");
        printPoints(points);
    }
}

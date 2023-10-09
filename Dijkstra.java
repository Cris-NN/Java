package algoritmos;

public class Dijkstra {
	private int matriz[][];
	private int numvertices;
	private static final int infinito = 100000;
	private int[] distancia;
	private String[] caminos;
	private boolean[] visto;

	public Dijkstra(int numvertices) {
		this.numvertices = numvertices;
		this.matriz = new int[numvertices][numvertices];
		distancia = new int[numvertices];
		caminos = new String[numvertices];
		visto = new boolean[numvertices];
	}

	public void insertaArista(int v1, int v2, int dist) {
		matriz[v1 - 1][v2 - 1] = dist;
		matriz[v2 - 1][v1 - 1] = dist;
	}

	public void dijkistra(int inicio) {
		for (int i = 0; i < numvertices; i++) {
			distancia[i] = infinito;
			visto[i] = false;
		}

		distancia[inicio] = 0;
		caminos[inicio] = "" + (inicio + 1);

		for (int i = 0; i < numvertices; i++) {

			int u = minDistance(distancia, visto);
			visto[u] = true;

			for (int j = 0; j < numvertices; j++) {
				if (!visto[j] && matriz[u][j] > 0 && distancia[u] != infinito) {
					if (distancia[u] + matriz[u][j] < distancia[j]) {
						distancia[j] = distancia[u] + matriz[u][j];
						caminos[j] = caminos[u] + "-" + (j + 1);
					}
				}
			}
		}

	}
	private int minDistance(int[] dist, boolean[] verticeYaProcesado) {
		int min = infinito;
		int min_index = 0;

		for (int v = 0; v < numvertices; v++)
			if (verticeYaProcesado[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}
	public void mostrar_vertice(int v) {
		System.out.println("\nVertice " + v);
		System.out.println(v + "\t" + distancia[v - 1] + "\t" + caminos[v - 1]);
	}
	public void mostrar() {
		System.out.println("Distancia del vertice desde el origen\n");
		for (int i = 0; i < numvertices; i++)
			System.out.println((i + 1) + "\t" + distancia[i] + "\t" + caminos[i]);
	}
}
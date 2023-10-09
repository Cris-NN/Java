package playlist;

import java.util.Comparator;

public class Compara implements Comparator<Cancion> {
	public int compare(Cancion o1, Cancion o2) {
		return (o1.getInterprete()+o1.getAlbum()).compareTo((o2.getInterprete()+o2.getAlbum()));
	}
}

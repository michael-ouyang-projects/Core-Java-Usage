package stream;

import java.util.ArrayList;

public class MichaelList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public MichaelStream<E> michaelStream() {
		return new MichaelStream(this);
	}

}

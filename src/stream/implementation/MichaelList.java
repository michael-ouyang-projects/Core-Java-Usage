package stream.implementation;

import java.util.ArrayList;

public class MichaelList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public MichaelStream<E> michaelStream() {
		return new MichaelStream<>((MichaelList<Object>) this);
	}

}

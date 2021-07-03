package stream.implementation;

import java.util.ArrayList;

public class MichaelList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;

	public MichaelStream<E> michaelStream() {
		MichaelList<Object> dataList = new MichaelList<Object>();
		dataList.addAll(this);
		return new MichaelStream<>(dataList);
	}

}

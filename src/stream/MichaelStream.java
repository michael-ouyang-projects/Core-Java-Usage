package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MichaelStream<E> {

	private MichaelList<Object> michaelList;
	private static ThreadLocal<List<StreamData>> streamDataList = new ThreadLocal<>();

	public MichaelStream(MichaelList<Object> michaelList) {
		this.michaelList = michaelList;
		if (streamDataList.get() == null) {
			streamDataList.set(new ArrayList<>());
		}
	}

	@SuppressWarnings("unchecked")
	public <R> MichaelStream<R> map(Function<E, R> function) {
		StreamData streamData = new StreamData();
		streamData.setFunction((Function<Object, Object>) function);
		streamDataList.get().add(streamData);
		return new MichaelStream<R>(michaelList);
	}

	@SuppressWarnings("unchecked")
	public MichaelStream<E> filter(Predicate<E> predicate) {
		StreamData streamData = new StreamData();
		streamData.setPredicate((Predicate<Object>) predicate);
		streamDataList.get().add(streamData);
		return new MichaelStream<E>(michaelList);
	}

	@SuppressWarnings("unchecked")
	public List<E> collect() {
		ListIterator<Object> iterator = michaelList.listIterator();
		outer: while (iterator.hasNext()) {
			Object data = iterator.next();
			for (StreamData streamData : streamDataList.get()) {
				if (streamData.getPredicate() != null) {
					if (!streamData.getPredicate().test(data)) {
						iterator.remove();
						continue outer;
					}
				} else if (streamData.getFunction() != null) {
					data = streamData.getFunction().apply(data);
				}
			}
			iterator.set(data);
		}
		return (List<E>) michaelList;
	}

}

class StreamData {

	private Function<Object, Object> function;
	private Predicate<Object> predicate;

	public Function<Object, Object> getFunction() {
		return function;
	}

	public void setFunction(Function<Object, Object> function) {
		this.function = function;
	}

	public Predicate<Object> getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate<Object> predicate) {
		this.predicate = predicate;
	}

}

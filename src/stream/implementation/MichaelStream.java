package stream.implementation;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MichaelStream<E> {

	private MichaelList<Object> dataList;
	private MichaelStream<Object> headStream;
	private MichaelStream<Object> nextStream;
	private Function<Object, Object> function;
	private Predicate<Object> predicate;

	@SuppressWarnings("unchecked")
	public MichaelStream(MichaelList<Object> dataList) {
		this.dataList = dataList;
		if (headStream == null) {
			headStream = (MichaelStream<Object>) this;
		}
	}

	@SuppressWarnings("unchecked")
	public <R> MichaelStream<R> map(Function<E, R> function) {
		MichaelStream<R> michaelStream = new MichaelStream<>(dataList);
		michaelStream.function = (Function<Object, Object>) function;
		michaelStream.headStream = headStream;
		nextStream = (MichaelStream<Object>) michaelStream;
		return michaelStream;
	}

	@SuppressWarnings("unchecked")
	public MichaelStream<E> filter(Predicate<E> predicate) {
		MichaelStream<E> michaelStream = new MichaelStream<>(dataList);
		michaelStream.predicate = (Predicate<Object>) predicate;
		michaelStream.headStream = headStream;
		nextStream = (MichaelStream<Object>) michaelStream;
		return michaelStream;
	}

	@SuppressWarnings("unchecked")
	public List<E> collect() {
		ListIterator<Object> iterator = dataList.listIterator();
		outer: while (iterator.hasNext()) {
			Object data = iterator.next();
			MichaelStream<Object> stream = headStream;
			do {
				if (stream.predicate != null) {
					if (!stream.predicate.test(data)) {
						iterator.remove();
						continue outer;
					}
				} else if (stream.function != null) {
					data = stream.function.apply(data);
				}
				stream = stream.nextStream;
			} while (stream != null);
			iterator.set(data);
		}
		return (List<E>) dataList;
	}

}

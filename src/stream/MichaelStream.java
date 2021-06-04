package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MichaelStream<E> {

	private MichaelList<?> michaelList;
	private static ThreadLocal<List<StreamData<?, ?>>> streamDataList = new ThreadLocal<>();
	
	public MichaelStream(MichaelList<?> michaelList) {
		this.michaelList = michaelList;
	}

	public <R> MichaelStream<R> map(Function<E, R> function) {
		StreamData<E, R> streamData = new StreamData<>();
		streamData.setFunction(function);
		streamDataList.get().add(streamData);
		return new MichaelStream<R>(michaelList);
	}

	public MichaelStream<E> filter(Predicate<E> predicate) {
		StreamData<E, ?> streamData = new StreamData<>();
		streamData.setPredicate(predicate);
		streamDataList.get().add(streamData);
		return new MichaelStream<E>(michaelList);
	}

	public List<E> collect() {
		List<E> returningList = new ArrayList<>();
		for (Object data : michaelList) {
			for(StreamData<?, ?> streamData : streamDataList.get()) {
				if(streamData.getPredicate() != null) {
					
				} else if(streamData.getFunction() != null) {
//					streamData.getFunction().apply(data);
				}
			}
		}
		return returningList;
	}

}

class StreamData<T, R> {

	private Function<T, R> function;
	private Predicate<T> predicate;

	public Function<T, R> getFunction() {
		return function;
	}

	public void setFunction(Function<T, R> function) {
		this.function = function;
	}

	public Predicate<T> getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate<T> predicate) {
		this.predicate = predicate;
	}

}

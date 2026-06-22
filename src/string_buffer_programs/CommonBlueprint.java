package string_buffer_programs;

import java.util.Objects;

public class CommonBlueprint<T> {
	private T data;

	public CommonBlueprint(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		CommonBlueprint other = (CommonBlueprint) obj;
		return Objects.equals(data, other.data);
	}

	public void setData(T data) {
		this.data = data;
	}
	

	@Override
	public String toString() {
		return "CommonClassTest [data=" + data + "]";
	}
	
	
}

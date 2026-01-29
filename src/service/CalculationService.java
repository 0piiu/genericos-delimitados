package service;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T maximo(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista nao pode ser vazia");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}

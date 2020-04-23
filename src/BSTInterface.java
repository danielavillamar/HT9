// DANIELA VILLAMAR 19086
// MIRKA MONZON 18139
// 22/04/2020
// HT9

public interface BSTInterface<Key extends Comparable<Key>, Value> {

	public void put(Key key, Value val);

    public boolean contains(Key key);

    public Value get(Key key);
}
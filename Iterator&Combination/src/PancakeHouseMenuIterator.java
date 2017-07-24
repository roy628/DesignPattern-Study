import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;
	public PancakeHouseMenuIterator(ArrayList items){
		this.items = new ArrayList(items);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= items.size())
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem item = (MenuItem)items.get(position);
		position++;
		return item;
	}
}

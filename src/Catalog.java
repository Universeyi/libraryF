import java.util.*;
import java.io.*;

/**
 * Maintains the information of a library catalog. Contains a
 * collection of {@link CatalogItem} objects.
 *
 * @author author name
 * @version  1.0.0
 * @see CatalogItem
 */
public class Catalog  {

	/* Collection of <code>CatalogItem</code> objects.*/
	private Vector items;

	/**
	 * Constructs an empty catalog.
	 */
	public Catalog() {

		items = new Vector();
	}

	/**
	 * Adds a {@link CatalogItem} object to this catalog.
	 *
	 * @param catalogItem  the {@link CatalogItem} object.
	 */
	public void addItem(CatalogItem catalogItem) {

		items.add(catalogItem);
	}

	/**
	 * Returns an iterator over the items in this catalog.
	 *
	 * return  an {@link Iterator}
	 */
	public Iterator getItemsIterator() {

		return items.iterator();
	}

	/**
	 * Returns the {@link CatalogItem} object with the specified
	 * <code>code</code>.
	 *
	 * @param code  the code of an item.
	 * @return  The {@link CatalogItem} object with the specifed
	 *          code. Returns <code>null</code> if the object with
	 *          the code is not found.
	 */
	public CatalogItem  getItem(String code)  {

		for (Iterator i = getItemsIterator(); i.hasNext();) {

			CatalogItem catalogItem = (CatalogItem) i.next();

			if (catalogItem.getCode().equals(code)) {

				return catalogItem;
			}
		}

		return null;
	}

	/**
	 * Returns the number of items in the catalog.
	 *
	 * @return the number of {@link CatalogItem} objects in this catalog.
	 */
	public int  getNumberOfItems()  {

		return items.size();
	}
}

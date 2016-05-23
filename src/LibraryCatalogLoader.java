import  java.io.*;
/**
 * This interface declares a method for obtaining a library catalog
 * from a file.
 *
 * @author author name
 * @version 1.1.0
 * @see Catalog
 */
public interface LibraryCatalogLoader  {

    /**
     * Loads the information in the specified file into a library
     * catalog and returns the catalog.
     *
     * @param filename  the name of the file that contains the
     *                  catalog data.
     * @return  a {@link Catalog}.
     * @throws FileNotFoundException  if the specified file does not
     *                                exist.
     * @throws IOException if there is an error reading the
     *                     information in the specified file.
     * @throws DataFormatException if the file contains malformed
     *                             data.
     */
    Catalog loadCatalog(String filename) throws IOException,
                FileNotFoundException, DataFormatException;
}


package itarator;

/**
 * Interface which contains methods which must be implemented by classes.
 */
public interface Iterator {

    /**
     * Check if collection contains next value.
     * @return boolean.
     */
    boolean hasNext();

    /**
     * Returns next value from array.
     * @return next Object.
     */
    Object next();
}

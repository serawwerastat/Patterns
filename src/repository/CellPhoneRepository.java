package repository;

import cellPhoneInterface.CellPhone;
import itarator.Aggregate;
import itarator.Iterator;
import modelsOfPhone.IPhone;
import modelsOfPhone.Samsung;
import modelsOfPhone.Xiaomi;
import modelsOfPhone.Nokia;

/**
 *  CellPhoneRepository class which implements itarator.Aggregate interface.
 */
public class CellPhoneRepository implements Aggregate {

    // Array with phone makes.
    private CellPhone cellPhones[] = {new Samsung(), new IPhone(), new Nokia(), new Xiaomi()};

    /**
     * Gets iterator.
     * @return CellPhoneMakeIterator object.
     */
    @Override
    public Iterator getIterator() {
        return new CellPhoneIterator();
    }

    /**
     *  CellPhoneMakeIterator class which implements itarator.Iterator interface.
     */
    private class CellPhoneIterator implements Iterator {

        private int index = 0;

        /**
         * Check if collection contains next value.
         * @return boolean.
         */
        @Override
        public boolean hasNext() {
            if(index < cellPhones.length){
                return true;
            }
            return false;
        }

        /**
         * Returns next value from array.
         * @return String value of cell phone make.
         */
        @Override
        public Object next() {
            return cellPhones[index++];
        }
    }
}
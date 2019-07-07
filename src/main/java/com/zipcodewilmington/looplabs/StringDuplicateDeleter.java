package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] value = new String[0];
        String[] myArrays;
        int numOfOccurance = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    numOfOccurance++;
                }
            }
            if (numOfOccurance < maxNumberOfDuplications) {
                myArrays = Arrays.copyOf(value, value.length + 1);
                myArrays[myArrays.length - 1] = String.valueOf(array[i]);
                value = myArrays;

            }
            numOfOccurance = 0;
        }
        return value;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] Values = new String[0];
        String[] myArrays;
        int numOfOccurance = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    numOfOccurance++;

                }
            }
            if (numOfOccurance != exactNumberOfDuplications) {
                myArrays = Arrays.copyOf(Values, Values.length + 1);
                myArrays[myArrays.length - 1] = String.valueOf(array[i]);
                Values = myArrays;

            }
            numOfOccurance = 0;
        }
        return Values;
    }
}

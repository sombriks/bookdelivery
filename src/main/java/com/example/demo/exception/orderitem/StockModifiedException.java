package com.example.demo.exception.orderitem;

import java.io.Serial;

/**
 * Custom exception class for cases where stock has been modified.
 */
public class StockModifiedException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -6613021311865491436L;

    private static final String DEFAULT_MESSAGE =
            "Stock Modified Exception!";

    public StockModifiedException() {
        super(DEFAULT_MESSAGE);
    }

}

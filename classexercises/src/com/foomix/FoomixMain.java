package com.foomix;

import com.foomix.model.FoomixNetwork;
import com.foomix.model.MarketPlace;

public class FoomixMain {
    public static void main(String[] args) {
        FoomixNetwork foomixNetwork = new FoomixNetwork(new MarketPlace());
    }
}
